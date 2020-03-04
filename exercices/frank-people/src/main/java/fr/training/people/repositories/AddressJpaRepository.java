package fr.training.people.repositories;

import fr.training.people.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressJpaRepository extends JpaRepository<Address, Long> {
  //
}
