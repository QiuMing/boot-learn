## spring boot go 

### spring-boot-starter

```
[INFO] --- maven-dependency-plugin:2.10:tree (default-cli) @ demo ---
[INFO] com.example:demo:jar:0.0.1-SNAPSHOT
[INFO] +- org.springframework.boot:spring-boot-starter:jar:1.4.0.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot:jar:1.4.0.RELEASE:compile
[INFO] |  |  \- org.springframework:spring-context:jar:4.3.2.RELEASE:compile
[INFO] |  |     +- org.springframework:spring-aop:jar:4.3.2.RELEASE:compile
[INFO] |  |     +- org.springframework:spring-beans:jar:4.3.2.RELEASE:compile
[INFO] |  |     \- org.springframework:spring-expression:jar:4.3.2.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot-autoconfigure:jar:1.4.0.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter-logging:jar:1.4.0.RELEASE:compile
[INFO] |  |  +- ch.qos.logback:logback-classic:jar:1.1.7:compile
[INFO] |  |  |  \- ch.qos.logback:logback-core:jar:1.1.7:compile
[INFO] |  |  +- org.slf4j:jcl-over-slf4j:jar:1.7.21:compile
[INFO] |  |  +- org.slf4j:jul-to-slf4j:jar:1.7.21:compile
[INFO] |  |  \- org.slf4j:log4j-over-slf4j:jar:1.7.21:compile
[INFO] |  +- org.springframework:spring-core:jar:4.3.2.RELEASE:compile
[INFO] |  \- org.yaml:snakeyaml:jar:1.17:runtime
[INFO] \- org.springframework.boot:spring-boot-starter-test:jar:1.4.0.RELEASE:test
[INFO]    +- org.springframework.boot:spring-boot-test:jar:1.4.0.RELEASE:test
[INFO]    +- org.springframework.boot:spring-boot-test-autoconfigure:jar:1.4.0.RELEASE:test
[INFO]    +- com.jayway.jsonpath:json-path:jar:2.2.0:test
[INFO]    |  +- net.minidev:json-smart:jar:2.2.1:test
[INFO]    |  |  \- net.minidev:accessors-smart:jar:1.1:test
[INFO]    |  |     \- org.ow2.asm:asm:jar:5.0.3:test
[INFO]    |  \- org.slf4j:slf4j-api:jar:1.7.21:compile
[INFO]    +- junit:junit:jar:4.12:test
[INFO]    +- org.assertj:assertj-core:jar:2.5.0:test
[INFO]    +- org.mockito:mockito-core:jar:1.10.19:test
[INFO]    |  \- org.objenesis:objenesis:jar:2.1:test
[INFO]    +- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO]    +- org.hamcrest:hamcrest-library:jar:1.3:test
[INFO]    +- org.skyscreamer:jsonassert:jar:1.3.0:test
[INFO]    |  \- org.json:json:jar:20140107:test
[INFO]    \- org.springframework:spring-test:jar:4.3.2.RELEASE:test
[INFO] ------------------------------------------------------------------------
```

```
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-dependency-plugin:2.10:tree (default-cli) @ demo ---
[INFO] com.example:demo:jar:0.0.1-SNAPSHOT
[INFO] +- org.springframework.boot:spring-boot-starter-web:jar:1.4.0.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter:jar:1.4.0.RELEASE:compile
[INFO] |  |  +- org.springframework.boot:spring-boot-starter-logging:jar:1.4.0.RELEASE:compile
[INFO] |  |  |  +- ch.qos.logback:logback-classic:jar:1.1.7:compile
[INFO] |  |  |  |  \- ch.qos.logback:logback-core:jar:1.1.7:compile
[INFO] |  |  |  +- org.slf4j:jcl-over-slf4j:jar:1.7.21:compile
[INFO] |  |  |  +- org.slf4j:jul-to-slf4j:jar:1.7.21:compile
[INFO] |  |  |  \- org.slf4j:log4j-over-slf4j:jar:1.7.21:compile
[INFO] |  |  \- org.yaml:snakeyaml:jar:1.17:runtime
[INFO] |  +- org.springframework.boot:spring-boot-starter-tomcat:jar:1.4.0.RELEASE:compile
[INFO] |  |  +- org.apache.tomcat.embed:tomcat-embed-core:jar:8.5.4:compile
[INFO] |  |  +- org.apache.tomcat.embed:tomcat-embed-el:jar:8.5.4:compile
[INFO] |  |  \- org.apache.tomcat.embed:tomcat-embed-websocket:jar:8.5.4:compile
[INFO] |  +- org.hibernate:hibernate-validator:jar:5.2.4.Final:compile
[INFO] |  |  +- javax.validation:validation-api:jar:1.1.0.Final:compile
[INFO] |  |  +- org.jboss.logging:jboss-logging:jar:3.3.0.Final:compile
[INFO] |  |  \- com.fasterxml:classmate:jar:1.3.1:compile
[INFO] |  +- com.fasterxml.jackson.core:jackson-databind:jar:2.8.1:compile
[INFO] |  |  +- com.fasterxml.jackson.core:jackson-annotations:jar:2.8.1:compile
[INFO] |  |  \- com.fasterxml.jackson.core:jackson-core:jar:2.8.1:compile
[INFO] |  +- org.springframework:spring-web:jar:4.3.2.RELEASE:compile
[INFO] |  |  +- org.springframework:spring-aop:jar:4.3.2.RELEASE:compile
[INFO] |  |  +- org.springframework:spring-beans:jar:4.3.2.RELEASE:compile
[INFO] |  |  \- org.springframework:spring-context:jar:4.3.2.RELEASE:compile
[INFO] |  \- org.springframework:spring-webmvc:jar:4.3.2.RELEASE:compile
[INFO] |     \- org.springframework:spring-expression:jar:4.3.2.RELEASE:compile
[INFO] +- org.springframework.boot:spring-boot-starter-test:jar:1.4.0.RELEASE:test
[INFO] |  +- org.springframework.boot:spring-boot-test:jar:1.4.0.RELEASE:test
[INFO] |  +- org.springframework.boot:spring-boot-test-autoconfigure:jar:1.4.0.RELEASE:test
[INFO] |  +- com.jayway.jsonpath:json-path:jar:2.2.0:test
[INFO] |  |  +- net.minidev:json-smart:jar:2.2.1:test
[INFO] |  |  |  \- net.minidev:accessors-smart:jar:1.1:test
[INFO] |  |  |     \- org.ow2.asm:asm:jar:5.0.3:test
[INFO] |  |  \- org.slf4j:slf4j-api:jar:1.7.21:compile
[INFO] |  +- junit:junit:jar:4.12:test
[INFO] |  +- org.assertj:assertj-core:jar:2.5.0:test
[INFO] |  +- org.mockito:mockito-core:jar:1.10.19:test
[INFO] |  |  \- org.objenesis:objenesis:jar:2.1:test
[INFO] |  +- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] |  +- org.hamcrest:hamcrest-library:jar:1.3:test
[INFO] |  +- org.skyscreamer:jsonassert:jar:1.3.0:test
[INFO] |  |  \- org.json:json:jar:20140107:test
[INFO] |  +- org.springframework:spring-core:jar:4.3.2.RELEASE:compile
[INFO] |  \- org.springframework:spring-test:jar:4.3.2.RELEASE:test
[INFO] \- org.springframework.boot:spring-boot-devtools:jar:1.4.0.RELEASE:compile
[INFO]    +- org.springframework.boot:spring-boot:jar:1.4.0.RELEASE:compile
[INFO]    \- org.springframework.boot:spring-boot-autoconfigure:jar:1.4.0.RELEASE:compile
[INFO] ------------------------------------------------------------------------
```