import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  passwordVisible: boolean = false; // Estado para controlar la visibilidad de la contraseña

  constructor(private fb: FormBuilder, private router: Router) {
    // Configuración del formulario reactivo
    this.loginForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  ngOnInit(): void {}

  // Función para manejar la visibilidad de la contraseña
  togglePasswordVisibility(): void {
    this.passwordVisible = !this.passwordVisible; // Cambia el estado de visibilidad
  }

  // Función para manejar el envío del formulario
  onSubmit(): void {
    if (this.loginForm.valid) {
      console.log('Formulario de inicio de sesión válido', this.loginForm.value);
      this.router.navigate(['/register']);
    } else {
      console.log('Formulario de inicio de sesión no válido');
    }
  }

  // Función para navegar a la página de registro
  goToRegister(): void {
    this.router.navigate(['/register']);
  }
}
