	package com.project.Authentication;

import javax.security.auth.login.AccountNotFoundException;

import org.apache.catalina.User;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;


@Import({
      Authentication.class,
      AccountNotFoundException.class,
      Authentication.class,
      User.class
})
public class AuthenticationApplication {

   public static void main(String[] args, Object SpringApplication) {
      //((Object) SpringApplication).run(AuthenticationApplication.class, args);
   }

}
