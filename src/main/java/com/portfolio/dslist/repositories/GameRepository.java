package com.portfolio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.dslist.entities.Game;  

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
