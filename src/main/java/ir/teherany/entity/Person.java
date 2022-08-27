package ir.teherany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull(message = "Name cannot be null")
    @Column(name = "name")
    private String name;

    @NotNull(message = "Family cannot be null")
    @Column(name = "family")
    private String family;

    @Email(message = "Email should be valid")
    @Size(min = 5, max = 20, message = "Email must be between 5 and 20 characters")
    @Column(name = "email")
    private String email;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 99, message = "Age should not be greater than 99")
    @Column(name = "age")
    private Integer age;
}
