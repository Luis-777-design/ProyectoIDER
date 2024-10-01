import { Component } from '@angular/core';
import { RouterModule, Route } from '@angular/router'; 
import { RegisterComponent } from './register/register.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  standalone: true, 
  imports: [RouterModule] 
})
export class AppComponent {
  title = 'proyectoIDER';
}
