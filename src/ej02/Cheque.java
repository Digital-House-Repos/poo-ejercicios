package ej02;

import java.util.Date;

public class Cheque {
    private int id;
    private double monto;
    private String tipo;
    private Date fechaEmision;
    private Date fechaVecimiento;
    private int plazo;
    private String personaEmisora;
    private String personaReceptora;

    // Constructor
    public Cheque(int id, double monto, String tipo, Date fechaEmision, Date fechaVecimiento, String personaEmisora, String personaReceptora) {
        this.id = id;
        this.monto = monto;
        this.tipo = tipo;
        this.fechaEmision = fechaEmision;
        this.fechaVecimiento = fechaVecimiento;
        this.plazo = 30;
        this.personaEmisora = personaEmisora;
        this.personaReceptora = personaReceptora;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVecimiento() {
        return fechaVecimiento;
    }

    public void setFechaVecimiento(Date fechaVecimiento) {
        this.fechaVecimiento = fechaVecimiento;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public String getPersonaEmisora() {
        return personaEmisora;
    }

    public void setPersonaEmisora(String personaEmisora) {
        this.personaEmisora = personaEmisora;
    }

    public String getPersonaReceptora() {
        return personaReceptora;
    }

    public void setPersonaReceptora(String personaReceptora) {
        this.personaReceptora = personaReceptora;
    }

    // Methods
    public void endosar(String personaReceptora) {
        this.personaReceptora = personaReceptora;
    }

    public boolean verificarVencimiento() {
        Date fechaActual = new Date();
        return fechaActual.after(fechaVecimiento);
    }
}
