package fr.training.people.controllers;

import fr.training.people.dtos.AddressCreateDto;
import fr.training.people.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/addresses")
public class AddressController {

  @Autowired // @Inject
  private AddressService service;

  public AddressController() {
    // controller
  }

  @PostMapping
  public void create(@RequestBody @Valid AddressCreateDto dto) {
    service.create( dto );
  }
}
