package xroigmartin.msc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xroigmartin.msc.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
