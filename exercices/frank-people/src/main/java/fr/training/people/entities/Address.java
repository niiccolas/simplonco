package fr.training.people.entities;

import javax.persistence.*;

@Entity // Mappe cette classe avec table
@Table(name = "addresses") // Nom de table, != du nom de classe
public class Address {

  @Id // Ce champ est la clef primaire de la table
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "zipcode", length = 20, nullable = false)
  private String zipCode;

  @Column(length = 100, nullable = false)
  private String street;

  @Column(length = 50, nullable = false)
  private String city;

  @Column(length = 30, nullable = false)
  private String country;

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "Address{" +
            "id=" + id +
            ", zipCode='" + zipCode + '\'' +
            ", street='" + street + '\'' +
            ", city='" + city + '\'' +
            '}';
  }
}
