package ej01;

import java.util.Scanner;

public class Caja {
    private int id;
    private String titular;
    private double saldo;
    private String alias;
    private String cbu;

    // Constructor
    public Caja(int id, String titular, double saldo, String alias, String cbu) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
        this.alias = alias;
        this.cbu = cbu;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    //toString
    @Override
    public String toString() {
        return "Id: " + this.id + "\n" +
                "Titular: " + this.titular + "\n" +
                "Saldo: " + this.saldo + "\n" +
                "Alias: " + this.alias + "\n" +
                "CBU: " + this.cbu + "\n";
    }

    // Methods
    public void retirar(double _monto, boolean _confirmacion) {
        if (_confirmacion && _monto > 0 && _monto <= this.saldo) {
            this.saldo -= _monto;
        }
    }

    public void depositar(double _monto, boolean _confirmacion) {
        if (_confirmacion && _monto > 0) {
            this.saldo += _monto;
        }
    }

    public void transferir(String _cbu, double _monto, boolean _confirmacion) {
        if (_confirmacion && this.saldo > 0) {
            this.saldo -= _monto;
        }
    }

    public boolean verificarInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println(this);
        System.out.println("¿Los datos son correctos?");
        System.out.println("1) Si");
        System.out.println("2) No");

        int opcion = sc.nextInt();
        return opcion == 1;
    }

}
