package de.michlb.sample.domain;

import javax.persistence.*;

/**
 * Created by mbart on 28.02.2016.
 */
@Entity
@Table(name = "person")
public class Person {

  @Id
  @GeneratedValue
  @Column(name = "ID")

  private Long id;

  @Column(name = "FIRSTNAME")
  private String firstname;
  @Column(name = "LASTNAME")
  private String lastname;

  @Column(name = "Password")
  private String password;

  @Column(name = "Phone")
  private String Phone;


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return Phone;
  }

  public void setPhone(String phone) {
    Phone = phone;
  }

  public Person() {
  }

  public Person(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
}
