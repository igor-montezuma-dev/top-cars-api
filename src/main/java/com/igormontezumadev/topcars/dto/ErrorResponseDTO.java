package com.igormontezumadev.topcars.dto;

import lombok.Data;

@Data
public class ErrorResponseDTO {

    private int status;
    private String message;
}
