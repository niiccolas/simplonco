package fr.training.people.services;

import fr.training.people.dtos.AddressCreateDto;
import fr.training.people.entities.Address;
import fr.training.people.repositories.AddressJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

  private final AddressJpaRepository repository;

  public AddressServiceImpl(AddressJpaRepository repository) {
    this.repository = repository;
  }

  @Override
  public void create(AddressCreateDto dto) {
    Address address = new Address();
    address.setStreet( dto.getStreet() );
    address.setCity( dto.getCity() );
    address.setZipCode( dto.getZipCode() );
    address.setCountry( dto.getCountry() );
    repository.save( address );
  }
}
