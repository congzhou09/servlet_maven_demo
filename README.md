#### 项目组织
◆jar包依赖以及Tomcat配置与IDEA配置混在一起不方便版本管理，改用maven组织项目，servlet容器改用maven+jetty-maven-plugin；

#### 启动
◇控制台项目根目录下运行：mvn jetty:run；

◇访问“http://localhost:8080/servlet_demo/index.jsp”得到jsp运行结果内容；

◇访问“http://localhost:8080/servlet_demo/index”将由servlet“Hello”处理，并最终forward到“info.jsp”页面；

◇通过filter机制实现日志功能，访问任何servlet地址将在服务器控制台打印时间和访问url；

◇通过listener机制实现在Context初始化时获取Context配置值并打印信息；