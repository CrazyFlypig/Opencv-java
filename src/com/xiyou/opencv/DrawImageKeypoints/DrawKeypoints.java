package com.xiyou.opencv.DrawImageKeypoints;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.Features2d;
import org.opencv.highgui.Highgui;

import static java.lang.System.exit;

/**
 * 绘制图像的SIFT特征点
 *
 * @author cc
 * @create 2017-05-09-23:59
 */

public class DrawKeypoints {
    public static void main(String[] args) {

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        //建立图片索引
        String img1 = "D:\\image_recognition\\cc.png";
        //读入图片
        Mat des1 = null;
        if ((des1 = Highgui.imread(img1)) == null) {
            System.out.println("图片读入失败");
            exit(0);
        }
        //特征检测器,提取特征
        FeatureDetector featureDetector1 = FeatureDetector.create(FeatureDetector.SIFT);
        MatOfKeyPoint keypoints1 = new MatOfKeyPoint();
        featureDetector1.detect(des1,keypoints1);
        //绘制关键点
        String out = "D:/image_recognition/cc-key.png";
        Mat outimg = new Mat();
        Features2d.drawKeypoints(des1,keypoints1,outimg);
        Highgui.imwrite(out,outimg);
        System.out.println("successful!");
    }
}
