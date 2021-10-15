package com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class ArchivoMovimientosOtrosFormatos implements Question<Boolean> {

    private String nombreDelArchivo;
    private File archivo;
    public ArchivoMovimientosOtrosFormatos(String nombreDelArchivo) {
        this.nombreDelArchivo = nombreDelArchivo;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String formatoRutaBasica = System.getProperty("user.dir") + File.separator + "download" +  File.separator  + "%s";
        try {
                String path = URLDecoder.decode(String.format(formatoRutaBasica, nombreDelArchivo), StandardCharsets.UTF_8.name());
                archivo = new File(path);

        } catch (UnsupportedEncodingException e) {
           e.printStackTrace();
        }

        return archivo.exists();
    }

    public static ArchivoMovimientosOtrosFormatos esCorrecto(String nombreDelArchivo) {
        return new ArchivoMovimientosOtrosFormatos(nombreDelArchivo);
    }
}