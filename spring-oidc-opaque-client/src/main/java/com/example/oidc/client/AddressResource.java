package com.example.oidc.client;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AddressResource {

  @NotBlank
  @Size(max = 100)
  private String street;

  @NotBlank
  @Size(max = 20)
  private String zip;

  @NotBlank
  @Size(max = 100)
  private String city;

  @Size(max = 100)
  private String state;

  @NotBlank
  @Size(max = 100)
  private String country;

  public AddressResource() {
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
