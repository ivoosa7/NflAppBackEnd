package com.nfl.seasonproject.dtos;

public record TeamResponse(
    String id,
    String nomeFranquia,
    String cidade,
    String local,
    String estadio,
    String conferencia,
    String divisao,
    Integer titulosSuperbowl
){
}
