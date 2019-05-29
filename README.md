# 图书分享
一个非常简单的图书分享网站，基于Spring Boot搭建。

# 相关软件
1.	Apache Maven (http://maven.apache.org). 
2.	Docker (http://docker.com). 
3.	Git Client (http://git-scm.com). 
4.  Java version 1.8
5.  MySQL 5.6

# 编译镜像文件
在根目录执行如下命令：
   **mvn clean package docker:build**

# 运行服务
   **docker-compose -f docker/common/docker-compose.yml up**
   
   或者：
   **docker run -it --rm -p 8060:8060 --name booklib rjguanwen/booklib:0.1**

