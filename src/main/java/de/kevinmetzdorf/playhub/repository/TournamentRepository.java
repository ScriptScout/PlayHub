package de.kevinmetzdorf.playhub.repository;

import de.kevinmetzdorf.playhub.model.Tournament;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TournamentRepository extends MongoRepository<Tournament, String> {
    // Hier können benutzerdefinierte Abfragen hinzugefügt werden, falls benötigt.
}
