package com.example.oidc.client;

import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/")
public class DemoRestController {

  private final WebClient webClient;

  public DemoRestController(WebClient webClient) {
    this.webClient = webClient;
  }

  @GetMapping
  public String index(@AuthenticationPrincipal OidcUser oidcUser) {
    return "it works for " + oidcUser.getFullName();
  }

  @GetMapping(path = "/userinfo", produces = MediaType.APPLICATION_JSON_VALUE)
  public UserInfo userInfo(@RegisteredOAuth2AuthorizedClient("demo") OAuth2AuthorizedClient authorizedClient) {

    return webClient
            .get()
            .uri("http://localhost:8080/auth/userinfo")
            .accept(MediaType.APPLICATION_JSON)
            .header("Authorization", "Bearer " + authorizedClient.getAccessToken().getTokenValue())
            .retrieve()
            .bodyToMono(UserInfo.class)
            .block();
  }
}
