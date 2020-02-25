package fr.training.people.services;

import fr.training.people.dtos.AddressCreateDto;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

  @Override
  public void create(AddressCreateDto dto) {
    System.out.println(dto);
  }
}
