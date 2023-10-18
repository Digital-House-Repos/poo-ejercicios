package ej03;

public class Consultorio {
    private int id;
    private String telefono;
    private String veterinario;

    // Constructor
    public Consultorio(int id, String telefono, String veterinario) {
        this.id = id;
        this.telefono = telefono;
        this.veterinario = veterinario;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    // Methods
}
