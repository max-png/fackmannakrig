package codes.rune.fackmannakrig.services;

import codes.rune.fackmannakrig.models.MatchResult;
import codes.rune.fackmannakrig.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    // Inject a repository if needed
    @Autowired
    private PlayerRepository playerRepository;

    public MatchService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public int requestMatch(int playerId) {
        // TODO: If another player is waitin for match join it and play, otherwise start a new.
        // returns matchId
        return 0;
    }

    public MatchResult pollMatch(int matchId) {
        // TODO: poll for match created earlier.
        return new MatchResult();
    }
}
