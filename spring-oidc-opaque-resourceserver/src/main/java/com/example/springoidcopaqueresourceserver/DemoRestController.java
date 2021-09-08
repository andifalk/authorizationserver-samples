package com.example.springoidcopaqueresourceserver;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

  @GetMapping("/")
  public String hello(@AuthenticationPrincipal OAuth2AuthenticatedPrincipal user) {
    return String.format("Hello %s from resource server", user.getAttributes());
  }

}
