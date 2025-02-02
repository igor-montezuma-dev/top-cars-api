package com.igormontezumadev.topcars.dto;

import com.igormontezumadev.topcars.entity.Model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ModelDTO {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    private String nome;
    private BigDecimal valorFipe;
    private Long marcaId;
}
