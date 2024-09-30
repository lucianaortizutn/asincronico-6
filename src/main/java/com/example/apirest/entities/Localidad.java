package com.example.apirest.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.envers.Audited;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Localidad extends Base {
    private String denominacion;

    @OneToMany(mappedBy = "localidad")
    @JsonBackReference
    private Set<Domicilio> domicilios = new HashSet<>();

    @Override
    public String toString() {
        return "Localidad{" +
                "id=" + getId() +
                ", denominacion='" + denominacion +
                '}';
    }
}
