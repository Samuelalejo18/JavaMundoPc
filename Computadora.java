/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.proyecto.taller1;

public class Computadora {
    private static int contadorComputadoras = 0;
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Computadora [idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor
                + ", teclado=" + teclado + ", raton=" + raton + "]";
    }

}
