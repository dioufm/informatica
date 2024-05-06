Create projetc :
https://start.spring.io/


INtsallation mongo Db :
https://www.mongodb.com/compatibility/spring-boot
Cluster mongo DB :
https://cloud.mongodb.com/v2#/org/5e76cda53935b13a1f3a68c7/

souleyE59sss
mongodb+srv://informatica:souleyE59sss@cluster0.sefgi.mongodb.net/Cluster0


Postgre :

https://www.commandprompt.com/education/how-to-install-and-set-up-docker-postgresql-environment/
https://www.atlassian.com/data/admin/how-to-list-databases-and-tables-in-postgresql-using-psql

docker run --name postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres

connexion base de donnée :

docker exec -it postgres psql -U postgres

CREATE TABLE users (id INTEGER PRIMARY KEY, first_name VARCHAR, last_name VARCHAR);

CREATE SEQUENCE users_seq INCREMENT 1 START 50;

ANgular  :
https://medium.com/caravan-blog/les-6-%C3%A9tapes-pour-bien-d%C3%A9marrer-un-projet-angular-17-en-2024-72ab40041677
ng new front-informatica --routing --style=css --minimal

https://angular.ganatan.com/
npm install (installing dependencies)
npm outdated (verifying dependencies)

npm run test
npm run coverage
npm run lint

npm run build ( with SSR)
npm run serve

npm run start

***********************************************************************************
Angular & Docker

build image
docker build -t front-informatica:1.0.0 .

run container
docker run -d -p 4000:4000 front-informatica:1.0.0

run container mode bash

docker run -it front-informatica:1.0.0 /bin/bash

in your browser http://localhost:4000


ng generate module pages/general/contact --routing




ARchitecture micro service :

2 micro services  :
- users-service : USERS-SERVICE ( eureka client)
- catalogue-service  : CATALOGUE-SERVICE ( eureka client)

- Service discovery Eureka :( eureka netflix server)
	service-discovery  : serveur 

	Application	AMIs	Availability Zones	Status
	CATALOGUE-SERVICE	n/a (1)	(1)	UP (1) - DIOUF-LENOVO:CATALOGUE-SERVICE:9090
	USERS-SERVICE	n/a (1)	(1)	UP (1) - DIOUF-LENOVO:USERS-SERVICE:9091

-Service-gateway ( spring-cloud gateway + eureka client + actuator)
- users
- catalogue

