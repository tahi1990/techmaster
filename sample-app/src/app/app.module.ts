import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { UiModule } from "./ui/ui.module";
import { RouterModule } from "@angular/router";
import { HttpClient, HttpClientModule, HTTP_INTERCEPTORS } from "@angular/common/http";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { LoginComponent } from './login/login.component';
import { AuthGuardService } from "./guards/auth-guard.service";
import { LoginService } from "./services/login.service";
import { ApiModule } from "src/swagger";
import { HttpListener } from "./services/http-interceptor";

@NgModule({
  declarations: [AppComponent, LoginComponent],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, UiModule, FormsModule, ReactiveFormsModule, ApiModule],
  providers: [
    AuthGuardService,
    LoginService,
    {
      provide: HTTP_INTERCEPTORS,
      useClass: HttpListener, multi: true

    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
