01 Hello World
- prosty program w JAVA eclipse

01 springboot-db
- baza danych customers
- czyta posgresql 
- laduje dane i kasuje 
- gradle przyklad z net

02. supplier-portal - to wersja naszej aplikacji.
- 

02 Maven Project 
- utworzony w eclipse projekt w maven z dependency
- chyba jest tez tomcat

03. Kurs Java 
- kobioety do kodu przykladowe lekcje

04 Cats
- na eclipse 
- JAR conosle aplikcaja
- polaczenie z baza posgresql
- tomcat server dodany 
- webaplikacja deployed to tomcat ( w sumie nie wiem kiedy ona wstaje) 
- front end deployed na tomcat 

05 Cats
- na intelij tutaj 
- JAR sie udalo skompilowac 
- webowej aplikacji nie udalo sie podnies na tomcat. trzeba spring boot. 

06 Hello
- defaultowa aplikacja w JAVA stworzona w intelij 
- mozna zbudowac artefact

07 HelloWorldGradle jar file
- tutaj projet w gradle sciagniety z initializer web
buduje jar: build\libs\HelloWorldApp-1.0-SNAPSHOT.jar
z commad line
gradle build
java -jar build\libs\HelloWorldApp-1.0-SNAPSHOT.jar

08 spring- cli 
- app.grovy 
starts on 8080
need 
spring cli
gradle
grovy 

set JAVA_HOME=C:\tools\Java\jdk-11.0.3
set GROOVY_HOME=C:\tools\groovy-2.5.7
set GRADLE_HOME=C:\tools\gradle-5.4.1
set SPRING_HOME=C:\tools\spring2.1.6.RELEASE	


run: 
spring run app.groovy
Open localhost:8080 in your favorite web browser. You should see the following output:

spring jar my-app.jar app.groovy
java -jar my-app.jar
jar tf my-app.jar.original

09 PosgdreSQL generated
- web initializer with gradle & psogreSQL 
- przyklad 
- U:\projekty\09 PosgdreSQL generated\build\libs\demo-0.0.1-SNAPSHOT\jar
- bez klasy ale laczy sie z posgresql - ale nic nie robi
gradle build
java -jar ./build/libs/demo-0.0.1-SNAPSHOT.jar

10hellow mvn 
zbudowana z cmd line dla maven
spring init -d=web myapp
cd myapp
mvn spring-boot:run -uruchomilo aise na 8080

11hello2 curl i mvn 
curl https://start.spring.io/starter.zip  -o demo.zip
mvn spring-boot:run - nic nie dziala

12hello3 gradle
spring init --build=gradle -d=web myapp
--pkzip -extr=all demo.zip
gradle build
gradle bootRun


wh
start.spring.io - generated
web initializer 
-gradle 
-java 11
-data-jpa
-spring-web

    // SWAGGER
    compile('io.springfox:springfox-swagger2:2.7.0')
    compile('io.springfox:springfox-swagger-ui:2.7.0')
dependencies {
    implementation('org.springframework.boot:spring-boot-starter-data-jpa')
    implementation('org.springframework.boot:spring-boot-starter-web')
    compile('org.projectlombok:lombok')
    annotationProcessor('org.projectlombok:lombok:1.18.10')

    //POSTGRES
    compile('org.postgresql:postgresql:42.2.8')

    //MySQL
    compile('mysql:mysql-connector-java')


