package org.iesch.ad.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Empleado implements Serializable, Comparable<Empleado> {

    private static final long SerialVersionUID = 1L;

    // Constante
    protected final static double SALARIO_DEF = 600;


    // Atributos
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double salario;

    // Constructor default
    public Empleado() {
    }

    // Constructor
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return edad == empleado.edad && Double.compare(empleado.salario, salario) == 0 && Objects.equals(nombre, empleado.nombre) && Objects.equals(apellido, empleado.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, edad, salario);
    }

    // toString()
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    // compareTo()
    public int compareTo(Empleado a) {
        int estado = 1;
        if (this.edad == a.getEdad()) {
            estado = 0;
        } else if (this.edad > a.getEdad()) {
            estado = 1;
        }
        return estado;
    }
}
