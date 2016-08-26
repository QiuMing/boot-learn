# java web 之spring-boot 基础


## spring boot 基础讲解

### spring cli ，为 groovy 而生


* 简单介绍 groovy

  * Groovy是唯一能够扩展Java平台的脚本语言，无缝访问JavaAPI的特性。
  
  * 作为Java程序设计语言的一种可选替代品，增加了Python，Ruby的特性，可以用作应用程序的"黏合剂"。
  

* 常用命令

```
 spring --help <command>   查询指定 command 的用法
 spring init --list        查询可以用的依赖
 
 spring init --build=gradle --java-version=1.8 --dependencies=web --packaging=war sample-app.zip    init 示例用法
 
spring run app.groovy -- --server.port=9000  运行 groovy 脚本
JAVA_OPTS=-Xmx1024m spring run hello.groovy  指定 JAVA 参数运行

 spring install com.example:spring-boot-cli-extension:1.0.0.RELEASE 安装拓展
```

*  Initialzr 项目介绍

    * [initialzr on github](https://github.com/spring-io/initializr)
    
    * [initialzr on spring io](https://start.spring.io/)
        
### 步步为营

* 项目初始化，依赖于start-web、start-test

* 编写 Controller

* 配置logback

* dev-tools 加速

* 使用 spring-data-jpa 和 h2

* 使用 thymeleaf 

* 使用 swagger2




