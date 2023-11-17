package com.portfolio.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.dslist.dto.GameMinDTO;
import com.portfolio.dslist.entities.Game;
import com.portfolio.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService GameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = GameService.findAll();
        return result;
    }
}