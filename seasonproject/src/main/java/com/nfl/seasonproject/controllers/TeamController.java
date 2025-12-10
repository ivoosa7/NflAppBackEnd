package com.nfl.seasonproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nfl.seasonproject.dtos.TeamResponse;
import com.nfl.seasonproject.services.TeamService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/teams")
public class TeamController {
    
    @Autowired
    private TeamService tService;

    @GetMapping
    public ResponseEntity<List<TeamResponse>> getAllTeams(){
        return ResponseEntity.ok(tService.getAllTeams());
    }
}
