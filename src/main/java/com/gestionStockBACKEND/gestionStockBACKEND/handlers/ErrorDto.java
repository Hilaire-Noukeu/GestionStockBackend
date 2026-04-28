package com.gestionStockBACKEND.gestionStockBACKEND.handlers;

import com.gestionStockBACKEND.gestionStockBACKEND.exception.ErrorCodes;

import java.util.ArrayList;
import java.util.List;

public class ErrorDto {
    private Integer httpCode;

    private ErrorCodes code;

    private String message;

    private List<String> errors = new ArrayList<>();

}
