package com.company;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private int telefono;
    private String direccion;

    public Cliente(){}
    public Cliente(String nombre, int telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente c1 = (Cliente) o;
        return c1.nombre == this.nombre && c1.telefono == this.telefono && c1.direccion ==
                this.direccion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono, direccion);
    }
}
