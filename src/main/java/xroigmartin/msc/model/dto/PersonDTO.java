package xroigmartin.msc.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PersonDTO implements Serializable {

    private Long id;
    private String name;
    private String firstSurname;
    private String secondSurname;
    private String phone;
    private String mobile;
    private String email;
}
