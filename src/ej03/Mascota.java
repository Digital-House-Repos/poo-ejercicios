package ej03;

public class Mascota {
    private String nombre;
    private String especie;
    private String titular;
    private int edad;
    private double altura;
    private double peso;
    private String estado;

    // Constructor
    public Mascota(String nombre, String especie, String titular, int edad, double altura, double peso, String estado) {
        this.nombre = nombre;
        this.especie = especie;
        this.titular = titular;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.estado = estado;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Methods
    public void medir() {
    }
}
