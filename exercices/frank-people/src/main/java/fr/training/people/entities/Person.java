package fr.training.people.entities;

import java.time.LocalDate;

public class Person {
  private long id;
  private String firstName;
  private String lastName;
  private LocalDate birthDate;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

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

  public LocalDate getBirthdate() {
    return birthDate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthDate = birthdate;
  }
}