# BasicSpringBoot
a basic blank and empty springboot project 

this basic spring boot project is a runnable application that allows the user to see the basic structure of a springboot application.

the HelloWorldController exposes 3 basic restfull services that can be accessed vis the internet by typing:

http://localhost:8080/                    -displayes hello world 
http://localhost:8080/hello/jimmy         -displayes the words hello Jimmy! (jimmy can be replaces with any name)
http://localhost:8080/hello?name=jimmy    -displayes the words hello Jimmy! (the name variable can be givebn any string value)

added a docker file to the trunk of the project. if you need to build a docker image from the file follow these steps :

1. build a fat jar of the java project
2. move the docker file in to the target folder
3. edit the docker file and change the name of the jar file to wah tever you jar is called (the COPY command)
4. if needed update the CMD line to ensure the name is the same
5. save the doceker file
6. build image using docker




