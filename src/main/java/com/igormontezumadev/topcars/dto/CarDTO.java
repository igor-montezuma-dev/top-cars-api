package com.igormontezumadev.topcars.dto;

import lombok.Data;

@Data
public class CarDTO {
    private Long id;
    private Long modeloId;
    private String nomeModelo;
    private String cor;
    private String ano;
    private Double valor;
    private String combustivel;
    private Integer numPortas;
}

