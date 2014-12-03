package com.example.eduardooliveros.listadiseno;

/**
 * Created by eduardooliverosacosta on 3/12/14.
 */
public class TipoDatos {
    private String Titulo;
    private String Subtitulo;

    public TipoDatos(String titulo, String subtitulo){
        this.Titulo=titulo;
        this.Subtitulo=subtitulo;

    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getSubtitulo() {
        return Subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        Subtitulo = subtitulo;
    }
}
