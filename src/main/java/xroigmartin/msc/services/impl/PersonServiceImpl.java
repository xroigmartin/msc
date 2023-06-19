package xroigmartin.msc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import xroigmartin.msc.model.Person;
import xroigmartin.msc.repository.PersonRepository;
import xroigmartin.msc.services.PersonService;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    public final PersonRepository personRepository;

    @Override
    public Page<Person> findAllPersons(Pageable pageable){
        return personRepository.findAll(pageable);
    }

}
