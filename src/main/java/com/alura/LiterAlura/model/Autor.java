package com.alura.LiterAlura.model;

public class Autor {
    private String nombre;
    private int anioDeNacimiento;
    private int anioDeFallecimiento;

    public Autor(){}
    public Autor(String nombre, int añoDeNacimiento, int añoDeFallecimiento) {
        this.nombre = nombre;
        this.anioDeNacimiento = añoDeNacimiento;
        this.anioDeFallecimiento = añoDeFallecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioDeNacimiento() {
        return anioDeNacimiento;
    }

    public void setAnioDeNacimiento(int anioDeNacimiento) {
        this.anioDeNacimiento = anioDeNacimiento;
    }

    public int getAnioDeFallecimiento() {
        return anioDeFallecimiento;
    }

    public void setAnioDeFallecimiento(int anioDeFallecimiento) {
        this.anioDeFallecimiento = anioDeFallecimiento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", anioDeNacimiento=" + anioDeNacimiento +
                ", anioDeFallecimiento=" + anioDeFallecimiento +
                '}';
    }
}
