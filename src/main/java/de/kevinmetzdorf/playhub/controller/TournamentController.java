package de.kevinmetzdorf.playhub.controller;

import de.kevinmetzdorf.playhub.model.Tournament;
import de.kevinmetzdorf.playhub.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentController {

    private final TournamentService tournamentService;

    @Autowired
    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Tournament> createTournament(@RequestBody String tournamentName) {
        Tournament createdTournament = tournamentService.createTournament(tournamentName);
        return new ResponseEntity<>(createdTournament, HttpStatus.CREATED);
    }
}

