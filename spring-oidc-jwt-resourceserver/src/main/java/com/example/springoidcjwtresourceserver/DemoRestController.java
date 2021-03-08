package com.example.springoidcjwtresourceserver;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

  @GetMapping("/")
  public String hello(@AuthenticationPrincipal Jwt jwt) {
    return String.format("Hello %s from resource server", jwt.getSubject());
  }

}
