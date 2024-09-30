package com.example.apirest.entities;
import lombok.*;
import org.hibernate.envers.Audited;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "autor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Audited
public class Autor extends Base {

    private String nombre;
    private String apellido;
    @Column(length = 1500)
    private String biografia;

}
