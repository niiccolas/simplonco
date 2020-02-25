package fr.training.people.dtos;

import javax.validation.constraints.NotBlank;

public class PersonGetDto {
  @NotBlank
  private String firstName;
  @NotBlank
  private String lastName;

  public PersonGetDto(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public PersonGetDto() {}

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}