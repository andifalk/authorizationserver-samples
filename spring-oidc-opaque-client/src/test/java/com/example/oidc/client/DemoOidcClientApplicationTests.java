package com.example.oidc.client;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.jwt.JwtDecoder;

@SpringBootTest
class DemoOidcClientApplicationTests {

  @SuppressWarnings("unused")
  @MockBean
  private ClientRegistrationRepository clientRegistrationRepository;

  @Test
  void contextLoads() {
  }

}
