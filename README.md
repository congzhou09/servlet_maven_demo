
#### 启动
◇配置启动Tomcat；

◇访问“http://localhost:8080/servlet_demo/index.jsp”得到jsp运行结果内容；

◇访问“http://localhost:8080/servlet_demo/index”将由servlet“Hello”处理，并最终forward到“info.jsp”页面；

◇通过filter机制实现日志功能，访问任何servlet地址将在服务器控制台打印时间和访问url；

◇通过listener机制实现在Context初始化时获取Context配置值并打印信息；