package xroigmartin.msc.api.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import xroigmartin.msc.model.Person;
import xroigmartin.msc.model.dto.PersonDTO;
import xroigmartin.msc.services.PersonService;
import xroigmartin.msc.utils.pagination.PaginationUtils;

@RestController
@RequestMapping("api/v1/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;
    private final ModelMapper modelMapper;
    private final PaginationUtils paginationUtils;

    @GetMapping("")
    public ResponseEntity<Page<PersonDTO>> findAllPersons(@PageableDefault(size = 10, page = 0) Pageable pageable, HttpServletRequest request){
        Page<Person> persons = this.personService.findAllPersons(pageable);

        Page<PersonDTO> dtoList = persons.map(this::personEntityToDTO);
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(request.getRequestURL().toString());


        return ResponseEntity.ok().header("link", paginationUtils.createLinkHeader(dtoList, uriBuilder))
                .body(dtoList);
    }

    private PersonDTO personEntityToDTO(Person person){
        return modelMapper.map(person, PersonDTO.class);
    }
}
