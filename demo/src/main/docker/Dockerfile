#基础镜像，如果本地仓库没有，会从远程仓库拉取
FROM openjdk:8-jdk-alpine
RUN apk add --update curl && rm -rf /var/cache/apk/*
#容器中创建目录
#编译后的jar包copy到容器中创建到目录内
WORKDIR /app
COPY demo-0.0.1.jar /app/app.jar
#指定容器启动时要执行的命令
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]