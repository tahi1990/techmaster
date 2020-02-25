import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { AppComponent } from "./app.component";
import { LayoutComponent } from "./ui/layout/layout.component";
import { LoginComponent } from "./login/login.component";
import { AuthGuardService } from "./guards/auth-guard.service";

const routes: Routes = [
  {
    path: '',
    redirectTo: 'welcome',
    pathMatch: 'full'
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: '',
    component: LayoutComponent,
    canActivate: [AuthGuardService],
    children: [
      {
        path: 'welcome',
        loadChildren: './welcome/welcome.module#WelcomeModule'
      },
      {
        path: 'products',
        loadChildren: './products/products.module#ProductsModule'
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
