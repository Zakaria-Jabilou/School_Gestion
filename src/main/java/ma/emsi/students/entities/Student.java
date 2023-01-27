package ma.emsi.students.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String nom;
    private String cne;
    private String datedenaissance;

}
