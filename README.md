# Angular Spring Blueprint

[![Build Status](https://travis-ci.org/porscheinformatik/angular-spring-blueprint.svg?branch=master)](https://travis-ci.org/porscheinformatik/angular-spring-blueprint)

This is a small application blueprint with Angular frontend and Spring backend. 
The blueprint can be used to create web-based complex applications. It is not 
intended for websites with dynamic functionality.

## Building / Launching

### Local development

Prerequisites: Maven > 3.3 and Node > 6.9 (NPM > 3) installed.
 
Build in root directory of project with:

    mvn install

Install NPM dependenies in blueprint-frontend with:

    npm install

Import in your favorite IDE and launch BlueprintApplication or go to 
blueprint-backend and launch `mvn spring-boot:run`. This launches the backend 
server at [http://localhost:8080](http://localhost:8080).

In blueprint-frontend launch `npm start`. This launches the frontend (in watch mode) at 
[http://localhost:4200](http://localhost:4200). The backend calls will be proxied 
back to the backend server. Any changes on the frontend will directly compile and
reload the app.

### For Production

Build the whole project with Maven and NPM (uses 
[frontend-maven-plugin](https://github.com/eirslett/frontend-maven-plugin)):

    mvn install -P nodejs

After building you can launch the application via:

    java -jar blueprint-webapp-VERSION.jar


## Modules

### Backend

The blueprint-backend module is a Spring MVC application providing a REST-ful API.
This implementation uses Spring Data Key-Value as in-memory storage.

### Frontend

blueprint-frontend is an Angular app. The app is built with 
[Angular-CLI](https://github.com/angular/angular-cli).

### Webapp

The blueprint-webapp combines the frontend and backend in a startable Spring Boot
application. This module contains only configuration and the main class.

## TODOs

 * I18N - ng2-translate vs Angulat I18N
 * Authentication with OAuth
