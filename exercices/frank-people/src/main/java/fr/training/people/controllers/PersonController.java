package fr.training.people.controllers;

import fr.training.people.dtos.PersonCreateDto;
import fr.training.people.dtos.PersonGetDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@RestController
@RequestMapping("/persons")
public class PersonController {

  @CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT}, maxAge = 3600)
  @GetMapping("/id/{id}")
  public PersonGetDto getById(@PathVariable("id") Long id){
    PersonGetDto person = new PersonGetDto("Igot","Mcdemshoulders");
    return person;
  }

  @PostMapping
  public void create(@RequestBody @Valid PersonCreateDto personDto){
    String firstName = personDto.getFirstName();
    String lastName = personDto.getLastName();
    LocalDate birthdate = personDto.getBirthDate();

    System.out.println(personDto);
  }

  @GetMapping("/name/{name}")
  public String getByName(@PathVariable("name") String name){
    return "Person with name="+name;
  }

  @DeleteMapping("/id/{id}")
  public String deleteById(@PathVariable("id") Long id){
    return "Deleted Person with id="+id;
  }

  @DeleteMapping("/name/{name}")
  public String deleteByName(@PathVariable("name") String name){
    return "Deleted Person with name="+name;
  }

  public PersonController(){}
}