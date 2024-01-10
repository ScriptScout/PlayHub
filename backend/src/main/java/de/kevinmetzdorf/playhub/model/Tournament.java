package de.kevinmetzdorf.playhub.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tournament {

    @Id
    private Long id;
    private String name;
    // Weitere Eigenschaften

    // Getter und Setter
}
