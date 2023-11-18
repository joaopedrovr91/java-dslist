package com.portfolio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.dslist.entities.GameList;  

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
