import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';
import { provideRouter } from '@angular/router';
import { routes } from './app/app-routing.module'; 

bootstrapApplication(AppComponent, {
  providers: [
    provideRouter(routes) 
  ]
}).catch(err => console.error(err));
