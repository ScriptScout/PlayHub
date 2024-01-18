package de.kevinmetzdorf.playhub;

import de.kevinmetzdorf.playhub.model.Tournament;
import de.kevinmetzdorf.playhub.service.TournamentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Diese Annotation sagt JUnit, dass es sich um einen Spring Boot Test handelt.
// SpringBootTest erstellt den Spring-Context für den Test.
@SpringBootTest
public class TournamentServiceTest {

    // Diese Annotation ermöglicht die automatische Injektion von Abhängigkeiten,
    // in diesem Fall unser TournamentService, der getestet werden soll.
    @Autowired
    private TournamentService tournamentService;

    // Hier beginnt der eigentliche Test.
    // Die Testmethode wird mit der Annotation @Test gekennzeichnet.
    @Test
    public void testCreateTournament() {
        // Arrange (Vorbereitung): Hier bereiten wir die benötigten Daten für den Test vor.
        // In diesem Beispiel erstellen wir den Namen für das Turnier.
        String tournamentName = "Spring Boot Tournament";

        // Act (Ausführung): Hier führen wir die Aktion aus, die wir testen möchten.
        // In diesem Beispiel rufen wir die Methode createTournament des TournamentService auf.
        Tournament createdTournament = tournamentService.createTournament(tournamentName);

        // Assert (Überprüfung): Hier überprüfen wir das erwartete Ergebnis der Aktion.
        // In diesem Beispiel überprüfen wir, ob das erstellte Turnier nicht null ist und das Name-Feld korrekt ist.
        assertNotNull(createdTournament.getId()); // Überprüfe, dass die ID nicht null ist (normalerweise von der Datenbank generiert).
        assertEquals(tournamentName, createdTournament.getName());
        // Weitere Überprüfungen je nach Anforderungen könnten hier hinzugefügt werden.
    }
}
