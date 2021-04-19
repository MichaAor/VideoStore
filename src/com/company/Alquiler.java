package com.company;

import java.util.UUID;

public class Alquiler {
    private UUID id;
    private Cliente cliente;
    private BoletaPrest boleta;
    private Film pelicula;
    private int estado = 1;

    public Alquiler(Film pelicula,Cliente cliente) {
        this.id = UUID.randomUUID();
        this.boleta = new BoletaPrest();
        this.pelicula = pelicula;
        this.cliente = cliente;
    }

    public BoletaPrest getBoleta() {
        return this.boleta;
    }
    public void setBoleta(BoletaPrest boleta) {
        this.boleta = boleta;
    }

    public Film getPelicula() {
        return this.pelicula;
    }
    public void setPelicula(Film pelicula) {
        this.pelicula = pelicula;
    }

    public UUID getId() {
        return this.id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getEstado() {
        return this.estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
}
