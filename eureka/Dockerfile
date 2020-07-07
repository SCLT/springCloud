# 基于哪个镜像
FROM java:8

ADD target/*.jar eureka.jar

#端口
EXPOSE 8761

#运行Jar
ENTRYPOINT ["java", "-jar", "/eureka.jar"]