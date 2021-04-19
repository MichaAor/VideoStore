package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Film {
    private String titulo;
    private LocalDate fechaDeLanzamiento;
    private float duracion;
    private String clasfDeAudencia;
    private String siglasPais;
    private String descripcion;
    private int stock;
    private int cantVecesAlq;


    public Film(){}

    public Film(String titulo, LocalDate fechaDeLanzamiento, float duracion, String clasfDeAudencia, String siglasPais, String descripcion, int stock) {
        this.titulo = titulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracion = duracion;
        this.clasfDeAudencia = clasfDeAudencia;
        this.siglasPais = siglasPais;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaDeLanzamiento() {
        return this.fechaDeLanzamiento;
    }
    public void setFechaDeLanzamiento(LocalDate fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public float getDuracion() {
        return this.duracion;
    }
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getClasfDeAudencia() {
        return this.clasfDeAudencia;
    }
    public void setClasfDeAudencia(String clasfDeAudencia) {
        this.clasfDeAudencia = clasfDeAudencia;
    }

    public String getSiglasPais() {
        return this.siglasPais;
    }
    public void setSiglasPais(String siglasPais) {
        this.siglasPais = siglasPais;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantVecesAlq() {
        return this.cantVecesAlq;
    }
    public void setCantVecesAlq(int cantVecesAlq) {
        this.cantVecesAlq = cantVecesAlq;
    }

    public void fuiAlquilado(){
        this.cantVecesAlq++;
    }


    @Override
    public String toString() {
        return "Film{" +
                "titulo='" + titulo + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracion=" + duracion +
                ", clasfDeAudencia='" + clasfDeAudencia + '\'' +
                ", siglasPais='" + siglasPais + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", cantVecesAlq=" + cantVecesAlq +
                '}';
    }
}
