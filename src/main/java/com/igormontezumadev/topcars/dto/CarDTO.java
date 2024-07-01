package com.igormontezumadev.topcars.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CarDTO {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    private Long modeloId;
    private String nomeModelo;
    private String cor;
    private Integer ano;
    private BigDecimal valor;
    private String combustivel;
    private Integer numPortas;
}

