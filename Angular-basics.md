## Welcome to Angular learning

#### steps to setup Angular CLI

* Install Node Js
    
      brew install node
  
* Check Node version 

      node -v
  
* Install Angular CLI

      npm install -g @angular/cli@7    -> -g means its installed globally and available for all the Users on Machine
      
      # check for version 
      
      ng --version
      
* Create a new application

      ng new <application-name>
      
* Build and start application

      ng serve
      
 
#### Some important components of Angular project

* _package.json_ :: All project dependencies are mentioned here [Like pom.xml] and dependencies will be available under **node-modules** folder

* _tslint.json_ ::  coding standards are mentioned here

* _tsconfig.json_ ::  Converting TypeScript files to JavaScript files

* _src/app_ :: Will have our app logic [all components & Service logic]

* _**index.html**_ :: Whenever we go to browser [Ex: localhost:4200] - this file gets triggered


## Core Concepts of Angular

**_1. TypeScript_**

  * Superset of Javascript and strongly typed unlike JavaScript [not typed] - gives syntax error on compile time instead of run-time
  
  * In Angular it is complied to JavaScript while rendering application in Browser
  
  
**_2. Component_**

   * Different logical parts of application
   * Basically classes that interacts with .html file of the component - which gets displayed on Web browser!!
   
   * Angular App
     - Service
     - Component - (component.html, component.css, component.ts)
     
     example: 
     
     List-candidates-component:
      
      { html <-> typescript  <--(through constructor injection)  HTTPClientService [Angular application]} --> REST Controller [Boot application]
      
      
## Running Angular application

* when we run application - index.html gets triggered

       # body part in index.html
       
        <body>
          <app-root></app-root>
        </body>
        
        app-root is selector tag here
        
        what is Selector??
        
        app.components.ts file will have @component with it's selector
        
        @Component({
          selector: 'app-root',
          templateUrl: './app.component.html',
          styleUrls: ['./app.component.css']
        })
        
        so --> ./app.component.html file gets displayed on Web UI
        
**Create new component**

* Goto app folder and run generate command

      /Users/313248/Desktop/Online-Voting/voting-app
      
       ng generate component candidate
       
       # this component will be added to app.module.ts
       
       ## add route for displaying candiate component in "/Users/313248/Desktop/Online-Voting/voting-app/src/app/app-routing.module.ts"
       
          const routes: Routes = [
            {path: 'candidates', component: CandidateComponent},
          ];
          
          
## Get content from REST service/ Backend 

* For this create a HttpClient Service

      ng generate service service/httpclient  - create httpclient insdie the service folder under our app
      


## class or style binding - for user interaction on web page
      
       
       
     
  