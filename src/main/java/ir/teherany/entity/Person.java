package ir.teherany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @Column(name = "email")
    private String email;
}
