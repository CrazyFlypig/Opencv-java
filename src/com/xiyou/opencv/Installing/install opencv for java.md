# Installing Opencv for Java	#

----------
## Introduction to OpenCV for Java ##
从2.4.4 OpenCV,OpenCV支持桌面Java开发。本教程将帮助您在Windows系统上安装OpenCV。
## Install the latest Java version ##
安装最新版JDK从[http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html "Oracle")下载安装。
## Install OpenCV 3.x under Windows ##
首先，你应该下载opencv库文件（version 3.x），网址：[http://opencv.org/releases.html](http://opencv.org/releases.html "opencv")。然后安装已下载的opencv文件到你选择的本地目录。然后确认两件事：**opencv-3xx.jar文件位于\opencv\build\java，opencv_java3xx.dll文件位于\opencv\build\java\x86(32位系统）或 \opencv\build\java\x64（64位系统）**。
## Install Opencv 3.x under Linux ##
## Set up Opencv for Java in Eclipse ##
## Set up Opencv for Java in Intellij IDE ##
1. 在IDE中新建普通java项目。笔者命名为“opencv_test”
2. 点击项目右键单击打开“Project Structure”（或按F4快捷键）窗口。
3. 找到“Project Structure”窗口左侧的“Libraries”，单击。结果如图示：![](http://i.imgur.com/6Azbc2Q.png)
4. 添加opencv库。点击“Proje Structure”上方的“+”号，选择“java”，通过弹出对话框选择**opencv-3xx.jar**文件路径。效果如下图所示：![](http://i.imgur.com/xtSlIzn.png)点击OK，结果如下图所示：![](http://i.imgur.com/Lt0fWNy.png)点击Ok，窗口。
5. 在src目录下新建一个类，笔者命名为“Test.class”。编写测试代码：`
	1. System.out.println("Welcome to OpenCV " + Core.VERSION);
	2. Mat m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));
	3. System.out.println("OpenCV Mat: " + m);
	4. Mat mr1 = m.row(1);
	5. mr1.setTo(new Scalar(1));
	6. Mat mc5 = m.col(5);
	7. mc5.setTo(new Scalar(5));
	8. System.out.println("OpenCV Mat data:\n" + m.dump());`
6. 运行main函数，程序会报错，此时发生连接错误（找不到dll）。
7. 通过配置运行时参数，消除这个错误。通过工具栏![](http://i.imgur.com/ix7jtoU.png)或菜单“Run -> Edit Configurations”打开“Run/Debug Configurations”对话框。在对话框右侧找到VM options“对应的文本框，在文本框中填入参数“-Djava.library.path=your path/opencv/build/java/x64;your path/opencv/build/x64/vc12/bin”。文本中的your paht是你的opencv安装路径。笔者内容为：![](http://i.imgur.com/8oWFwMa.png)如果你的电脑是32位，可x86。选择OK退出“Run/Debug Configurations”对话框。
8. 运行测试代码，便可成功显示出结果。
参考教程：[http://www.cnblogs.com/yezhang/p/OpenCV_Java_IDEA.html](http://www.cnblogs.com/yezhang/p/OpenCV_Java_IDEA.html "")。
