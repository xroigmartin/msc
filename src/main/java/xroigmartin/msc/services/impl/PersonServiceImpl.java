package xroigmartin.msc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xroigmartin.msc.repository.PersonRepository;
import xroigmartin.msc.services.PersonService;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    public final PersonRepository personRepository;

}
