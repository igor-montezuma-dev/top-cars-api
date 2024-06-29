package com.igormontezumadev.topcars.dto;

import com.igormontezumadev.topcars.entity.Model;
import lombok.Data;

@Data
public class ModelDTO {
    private Long id;
    private String nome;
    private String valorFipe;
    private Long marcaId;
}
