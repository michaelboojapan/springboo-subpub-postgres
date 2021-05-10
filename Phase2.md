# 1. Overview
What I implemented was a pub/sub web application, which is handy to test the service we will build.
At phase2 we need to 
1. Restructure this web application to RestAPI, and JSON as the transferring data. 
2. Upgrade it to use Google Cloud Platform Sub/Pub.  


# 2, Setting up Cloud Pub/Sub
Google Cloud Platform Pub/Sub is an asynchronous messaging service designed to be highly reliable and scalable.
And it has below advantages
-Synchronous, cross-zone message replication and per-message receipt tracking ensures reliable delivery at any scale
-Auto-scaling and auto-provisioning with no partitions eliminates planning and ensures workloads are production ready from day one.
-Filtering, dead-letter delivery, and exponential backoff without sacrificing scale help simplify your applications


## 2.1 Create a new project in the Cloud Platform Console
please follow below manual to create new project.

 https://cloud.google.com/pubsub/docs/quickstart-console
 
## 2.2 Authenticating a service account
You will create an account(maybe you already have one) and you have to authenticate it.
https://cloud.google.com/docs/authentication/production

There is GOOGLE_APPLICATION_CREDENTIALS key generated and please donwload it as Json file, it will be used in step 3.


# 3.Upgrade Existing Project
## 3.1 Implementing a RESTful API 
Implementing a RESTful API based on a Web project of phase1.
note: we could leave the web application as a test purpose.

## 3.2 Upgrade Phase1 project
As Spring Boot starter is provided to auto-configure the various required Pub/Sub components, we will use Java8 and spring boot as I already set up in phase 1.
In phase2 we will upgrade it and use GCP Pub/Sub as the underlying message exchange mechanism.
There is detail below, please check
https://docs.spring.io/spring-cloud-gcp/docs/current/reference/html/index.html#cloud-pubsub

https://cloud.google.com/pubsub/docs/spring


## 3.3. sample 
Spring Cloud GCP Pub/Sub Code Sample
https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples/spring-cloud-gcp-pubsub-sample


# 4.Deploy
Google Compute Engine is a choice.
Let's deploy our project on Google Compute Engine, as it offers an ideal solution regarding throughput, stability, pricing, backups and security.


# 5.Monitor
If there is an alert it should send to slack(or some other daily communication tool) which we could immediately react to.
It could be set from log4j.
