package com.company;

import java.time.LocalDate;

public class BoletaPrest {
    private LocalDate fRetiro;
    private LocalDate fDevolucion;

    public BoletaPrest() {
        this.fRetiro = LocalDate.now();
        this.fDevolucion = LocalDate.now();
    }

    public LocalDate getfRetiro() {
        return this.fRetiro;
    }
    public void setfRetiro(LocalDate fRetiro) {
        this.fRetiro = fRetiro;
    }

    public LocalDate getfDevolucion() {
        return this.fDevolucion;
    }
    public void setfDevolucion(LocalDate fDevolucion) {
        this.fDevolucion = fDevolucion;
    }




}
