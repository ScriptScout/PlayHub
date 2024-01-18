package de.kevinmetzdorf.playhub.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tournaments")
public class Tournament {

    @Id
    private String id;
    private String name;

    // Konstruktor, Getter und Setter für 'name'

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Weitere Attribute und Methoden, wenn erforderlich.
}
