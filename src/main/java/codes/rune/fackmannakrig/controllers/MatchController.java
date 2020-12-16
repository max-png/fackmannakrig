package codes.rune.fackmannakrig.controllers;

import codes.rune.fackmannakrig.dtos.requests.NewMatch;
import codes.rune.fackmannakrig.dtos.responses.MatchPoll;
import codes.rune.fackmannakrig.models.MatchResult;
import codes.rune.fackmannakrig.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    public MatchService service;

    public MatchController(MatchService matchService) {
        service = matchService;
    }

    @PostMapping("/new")
    public ResponseEntity<Integer> newMatch(@RequestBody NewMatch matchRequest) {
        try {
            return ResponseEntity
                    .ok(service.requestMatch(matchRequest.playerId));
        } catch (Exception ex) {
            return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("poll/{gameId}")
    public ResponseEntity<MatchPoll> poll(@RequestParam int matchId) {
        try {
            MatchResult result = service.pollMatch(matchId);
            MatchPoll poll = new MatchPoll();
            poll.winner = result.winningFighterId;
            poll.report = result.matchReport;
            return ResponseEntity
                    .ok(poll);
        } catch (Exception ex) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
