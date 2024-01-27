package com.example.LaLigaStats.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository
        extends JpaRepository<Player, Long> {

//      SELECT * FROM player WHERE name = ?
    @Query("SELECT p FROM Player p WHERE p.name = ?1")
    Optional<Player> findPlayerByName(String name);

}
