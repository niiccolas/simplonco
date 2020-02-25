package fr.training.people.services;

import fr.training.people.dtos.AddressCreateDto;

public interface AddressService {
  // by default public & abstract
  void create(AddressCreateDto dto);
}
