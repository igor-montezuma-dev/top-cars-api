package com.igormontezumadev.topcars.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CarDTO {
    private Long id;
    private Long modeloId;
    private String nomeModelo;
    private String cor;
    private Integer ano;
    private BigDecimal valor;
    private String combustivel;
    private Integer numPortas;
}

