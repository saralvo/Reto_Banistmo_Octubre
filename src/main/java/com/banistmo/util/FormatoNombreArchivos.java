package com.banistmo.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatoNombreArchivos {

    private static final String DESCARGA = "políticas-tratamiento-y-protección-de-datos-personales-de-proveedores-grupo-bancolombia.pdf";

    public String pdf(String nombre) {

        return DESCARGA + ".pdf";
    }

}
