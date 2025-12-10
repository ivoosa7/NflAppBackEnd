package com.nfl.seasonproject.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TeamRequest(
    @NotBlank(message = "O nome da franquia não pode ser em branco.")
    String nomeFranquia,

    @NotBlank(message = "O nome da cidade não pode ser em branco.")
    String cidade,

    @NotBlank(message = "O nome do local não pode ser em branco.")
    String local,

    @NotBlank(message = "o nome do estádio não pode ser em branco.")
    String estadio,

    @NotBlank(message = "o nome da conferencia não pode ser em branco (AFC, NFC).")
    String conferencia,

    @NotBlank(message = "o nome da divisão não pode ser em branco (Leste, Oeste, Norte e Sul).")
    String divisao,

    @NotNull(message = "O número de título é necessário.")
    @Min(value = 0, message = "O número de títulos tem que ser igual ou superior a 0.")
    Integer titulosSuperbowl

){
}
