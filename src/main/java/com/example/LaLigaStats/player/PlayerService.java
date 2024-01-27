package com.example.LaLigaStats.player;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();

    }
    public List<Player> getPlayerByName(String searchTxt){ // get player by name
        return playerRepository.findAll()
                .stream().filter(player -> player.getName().toLowerCase().contains(searchTxt.toLowerCase()))
                .collect(Collectors.toList());
    }
    public List<Player> getPlayerByTeam(String teamSearch){ // get player by team
        return playerRepository.findAll()
                .stream().filter(player -> teamSearch.equals(player.getTeam()))
                .collect(Collectors.toList());
    }
    public List<Player> getPlayerByNation(String searchTxt){ // get player by nation
        return playerRepository.findAll()
                .stream().filter(player -> player.getNation().toLowerCase().contains(searchTxt.toLowerCase()))
                .collect(Collectors.toList());
    }
    public List<Player> getPlayerByPosition(String searchTxt){ // get player by position
        return playerRepository.findAll()
                .stream().filter(player -> player.getPos().toLowerCase().contains(searchTxt.toLowerCase()))
                .collect(Collectors.toList());
    }
    public List<Player> getPlayerByTeamAndPosition(String t, String p){
        return playerRepository.findAll().stream()
                .filter(player -> t.equals(player.getTeam()) && p.equals(player.getPos()))
                .collect(Collectors.toList());
    }


}
