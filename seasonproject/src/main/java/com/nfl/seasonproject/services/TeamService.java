package com.nfl.seasonproject.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nfl.seasonproject.dtos.TeamResponse;
import com.nfl.seasonproject.mappers.TeamMapper;
import com.nfl.seasonproject.repositories.TeamRepository;

@Service
public class TeamService {

    @Autowired
    private TeamRepository tRepository;

    public List<TeamResponse> getAllTeams(){
        return tRepository.findAll().stream().map(p -> TeamMapper.toDTO(p)).collect(Collectors.toList());
    }

}
