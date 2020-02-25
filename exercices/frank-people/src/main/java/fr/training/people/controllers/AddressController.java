package fr.training.people.controllers;

import fr.training.people.dtos.AddressCreateDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/addresses")
public class AddressController {

  @PostMapping
  public void create(@RequestBody @Valid AddressCreateDto dto) {
    System.out.println(dto);
  }
}
