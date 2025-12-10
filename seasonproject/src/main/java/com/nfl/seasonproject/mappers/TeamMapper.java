package com.nfl.seasonproject.mappers;

import com.nfl.seasonproject.dtos.TeamRequest;
import com.nfl.seasonproject.dtos.TeamResponse;
import com.nfl.seasonproject.entities.Team;

public class TeamMapper {
    public static TeamResponse toDTO(Team t){
        return new TeamResponse(
            t.getId(),
            t.getNomeFranquia(),
            t.getCidade(),
            t.getLocal(),
            t.getEstadio(),
            t.getConferencia(),
            t.getDivisao(),
            t.getTitulosSuperbowl()
        );
    }

    public static Team toEntity(TeamRequest tr){
        Team team = new Team();
        team.setNomeFranquia(tr.nomeFranquia());
        team.setCidade(tr.cidade());
        team.setLocal(tr.local());
        team.setEstadio(tr.estadio());
        team.setConferencia(tr.conferencia());
        team.setDivisao(tr.divisao());
        team.setTitulosSuperbowl(tr.titulosSuperbowl());

        return team;
    }
}
