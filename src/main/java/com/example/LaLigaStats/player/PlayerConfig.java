//package com.example.LaLigaStats.player;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//import static java.time.Month.*;
//
//
//@Configuration
//public class PlayerConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(
//            PlayerRepository repository){
//        return args -> {
//            Player bellingham = new Player("Jude Bellingham", "England", "CM", 20, 30, 29, 17.0, 930.0,
//                    17.0, 3.2, 2.1, 0.2, 23.0, 0.0, "Real Madrid");
//            Player camavinga = new Player("Eduardo Camavinga", "France", "CDM", 19, 20, 3, 8.0, 213.0,
//                    17.0, 3.2, 2.1, 0.2, 23.0, 0.0, "Real Madrid");
//
//            repository.saveAll(
//                    List.of(bellingham, camavinga)
//            );
//
//        };
//
//    };
//    }
//
//
