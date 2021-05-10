# 1. Overview
I would like to create a Web Application SUB/PUB service, using Spring Boot + Postgres + MyBatis.
For the sake of simplicity, PostgreSQL will be launched with Docker.

##The development environment is as follows
OS: macOS Big Sur 11.1
language : Java8
framework: Spring Boot, MyBatis 2.1.4
Development Tool: IDE IntelliJ IDEA
DB: Postgres	13-alpine
Docker:Docker	20.10.0, docker-compose	1.27.4


# 2. Setup DB
Run the command below in the root directory of our project
$ docker-compose up

After it done,
Go to http://localhost:18080 
and log in to the pgadmin console. For login information, use the following values
admin@example.com/admin

After logging in, click 'Add New Server' to display the 'Create','Server'  and set the following items and press Save.

![1](https://user-images.githubusercontent.com/83208891/117642429-35d73480-b1c2-11eb-8f2e-ae8f591a5bc8.JPG)





