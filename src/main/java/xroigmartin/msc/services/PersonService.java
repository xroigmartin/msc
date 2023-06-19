package xroigmartin.msc.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import xroigmartin.msc.model.Person;

public interface PersonService {

    Page<Person> findAllPersons(Pageable pageable);
}
