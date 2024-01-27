package com.example.LaLigaStats.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers( // get mapping for handling player services
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String nation,
            @RequestParam(required = false) String position) {
        if (team != null && position != null) {
            return playerService.getPlayerByTeamAndPosition(team, position);
        }
        else if(name != null) {
            return playerService.getPlayerByName(name);
        }
        else if(team != null) {
            return playerService.getPlayerByTeam(team);
        }
        else if(nation != null) {
            return playerService.getPlayerByNation(nation);
        }
        else if(position != null) {
            return playerService.getPlayerByPosition(position);
        }
        else {
            return playerService.getPlayers();
        }
    }
    @GetMapping("/{team}/{position}")
    public List<Player> getPlayersByTeamAndPosition(
            @PathVariable String team,
            @PathVariable String position) {
        return playerService.getPlayerByTeamAndPosition(team, position);
    }


}

