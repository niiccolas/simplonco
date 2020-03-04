package fr.training.people.controllers;

import fr.training.people.dtos.AddressCreateDto;
import fr.training.people.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/addresses")
public class AddressController {

  // @Autowired ou par constructeur
  private final AddressService service;

  public AddressController(AddressService service) {
    this.service = service;
  }

  @PostMapping
  public void create(@RequestBody @Valid AddressCreateDto dto) {
    service.create( dto );
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") Long id) {
    //
  }

  @GetMapping("/{id}")
  public  AddressCreateDto get(@PathVariable("id") Long id) {
    return null;
  }


}
