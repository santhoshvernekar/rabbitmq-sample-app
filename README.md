# rabbitmq-sample-app
Sample application to demonstrate connection with rabbit MQ

To run the application first we need to run Rabbit-MQ in our system

### Steps to run the rabbit-mq

Either we can install rabbit-mq on our system or we can run the docker-container of Rabbimq

##### Steps to install RabbitMQ service locally 
*  As rabbit-mq uses erlang, first we need to install Erlang from the site [https://www.erlang.org/downloads] 
![Erlong](https://user-images.githubusercontent.com/59571096/120082619-8cf56880-c0e1-11eb-8444-d0365ec5471a.png)

Its like regular installable file, you can easily install this

*  Then install rabbit-mq from rabbit-mq site [https://www.rabbitmq.com/install-windows.html]
![Rabbitmq](https://user-images.githubusercontent.com/59571096/120082718-2290f800-c0e2-11eb-960e-7ed1af2d33a1.png)


*  Start the rabbit-mq on your system 
   Go to search and type **RabbitMQ Service Start**
![Start](https://user-images.githubusercontent.com/59571096/120082803-8b787000-c0e2-11eb-886a-0932e136985d.png)


*  Launch rabbit-mq and see whether server is up or not, by default it runs on 15672 port and applications can connect through 5762 port.
   
   use [http://localhost:15672/] , default username and password is guest 
   
   ![Login](https://user-images.githubusercontent.com/59571096/120082911-443eaf00-c0e3-11eb-86b3-7d40d7cda6e4.png)

   Once the login is success, you will find the below screen
   
   ![Frontpage](https://user-images.githubusercontent.com/59571096/120082939-5b7d9c80-c0e3-11eb-9c28-f359d11db982.png)

*  This confirms that the application is up and running

   By default there will be some sample exchanges created, you can find same in below 
![Exchange](https://user-images.githubusercontent.com/59571096/120083063-d2b33080-c0e3-11eb-94c5-46e7c8cc311e.png)

   There wont be any queue or connection created by default and we have to create them based on our need. When connections are established it will be dispalyed on connection screen
   
![Queue](https://user-images.githubusercontent.com/59571096/120083072-f4141c80-c0e3-11eb-99b3-008e2902d440.png)

##### Steps to run app

*  We need to run this spring-boot application now, the application properties are mentioned application.properties file.

![AppRun](https://user-images.githubusercontent.com/59571096/120083167-6553cf80-c0e4-11eb-9029-c1e5a92b23a1.png)

*  I have exposed a end point to send message to rabbitmq service through a queue,  it will also create queue if it doesnt exist 

   Sample data is :  http://localhost:8080/san-rabbitmq/producer?empName=vernekar&empId=456

![MessageSent](https://user-images.githubusercontent.com/59571096/120083272-296d3a00-c0e5-11eb-86a5-ce0ae97c71c1.png)

*  When the message is sent, you can see the queue is getting created and connection established between the spring-boot application and rabbitmq
   
![NewQueue](https://user-images.githubusercontent.com/59571096/120083298-5f122300-c0e5-11eb-971b-76ad571a30b5.png)

*  We can go to Connections tab and see the active connection 

![Connection](https://user-images.githubusercontent.com/59571096/120083335-9a145680-c0e5-11eb-8fe7-ff760fa65090.png)

*  We can also see the message received, Go to queue and Click on getmessages button to see the messages received.

![SentMessages](https://user-images.githubusercontent.com/59571096/120083373-de075b80-c0e5-11eb-8f82-08141bb981e7.png)


I hope this helped you :)
