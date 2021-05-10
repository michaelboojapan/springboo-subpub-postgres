# Overview
I would like to create a Web Application using Spring Boot + Postgres + MyBatis.
For the sake of simplicity, PostgreSQL will be launched with Docker.

#The development environment is as follows
OS: macOS Big Sur 11.1
language : Java8
framework: Spring Boot, MyBatis 2.1.4
Development Tool: IDE IntelliJ IDEA
DB: Postgres	13-alpine
Docker:Docker	20.10.0, docker-compose	1.27.4


#Run the command below in the root directory of our project
$ docker-compose up

http://localhost:18080/

Go to http://localhost:18080 
and log in to the pgadmin console. For login information, use the following values ​​set in docker-compose.yml.
admin@example.com/admin


#After logging in, click Add New Server to display the Create --Server modal. Set the following items and press Save.






