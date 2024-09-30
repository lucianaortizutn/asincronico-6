package com.example.apirest.entities;
import lombok.*;
import org.hibernate.envers.Audited;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Libro extends Base {

    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}

