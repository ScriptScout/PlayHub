package de.kevinmetzdorf.playhub.service;

import de.kevinmetzdorf.playhub.model.Tournament;
import de.kevinmetzdorf.playhub.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository; // Annahme: Du verwendest Spring Data MongoDB.

    public Tournament createTournament(String name) {
        Tournament tournament = new Tournament();
        tournament.setName(name);

        // Hier könnten zusätzliche Logiken oder Speicheroperationen erfolgen, z.B. speichern in der Datenbank.
        return tournamentRepository.save(tournament);
    }
}
