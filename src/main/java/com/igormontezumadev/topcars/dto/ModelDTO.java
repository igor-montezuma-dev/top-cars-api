package com.igormontezumadev.topcars.dto;

import com.igormontezumadev.topcars.entity.Model;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ModelDTO {
    private Long id;
    private String nome;
    private BigDecimal valorFipe;
    private Long marcaId;
}
