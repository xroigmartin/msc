package xroigmartin.msc.model;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 6430968952390952516L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(name="first_surname", nullable = false, length = 50)
    private String firstSurname;

    @Column(name="second_surname", length = 50)
    private String secondSurname;

    @Column(length = 15)
    private String phone;

    @Column(nullable = false, length = 15)
    private String mobile;

    @Column(nullable = false, length = 15, unique = true)
    private String email;
}
