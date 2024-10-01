import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router'; 

@Component({
  selector: 'register',
  templateUrl: './register.component.html', 
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registerForm: FormGroup;
  mensajeVisible: boolean = false;

  constructor(private fb: FormBuilder, private router: Router) {
    this.registerForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  ngOnInit(): void {}

  onSubmit(): void {
    if (this.registerForm.valid) {
      console.log('Formulario de registro válido', this.registerForm.value);
      this.mensajeVisible = true;
    } else {
      console.log('Formulario de registro no válido');
      this.mensajeVisible = false;
    }
  }

  goToHome() {
    this.router.navigate(['/login']);
  }
}
