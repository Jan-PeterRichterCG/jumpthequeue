import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FormLoginComponent } from './form-login/form-login.component';
import { RegisterComponent } from './register/register.component';
import { ViewQueueComponent } from './view-queue/view-queue.component';
import { AuthGuardService } from './core/authentication/auth-guard.service';
import { environment } from 'src/environments/environment';


const appRoutes: Routes = [
  { path: 'FormLogin', component: FormLoginComponent},               // Redirect if url path is /access.
  { path: 'Register', component: RegisterComponent},               // Redirect if url path is /Register.
  { path: 'ViewQueue', component: ViewQueueComponent, canActivate: [AuthGuardService]}, 
  // Redirect if url path is /ViewQueue, check if canActivate() with the AuthGuardService.
  { path: '**', redirectTo: '/FormLogin', pathMatch: 'full' },  // Redirect if url path do not match with any other route.
 ];

@NgModule({
  imports: [
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: environment.production ? false : true }, // <-- debugging purposes only
    ),
  ],
  exports: [RouterModule],
})
export class AppRoutingModule { }

