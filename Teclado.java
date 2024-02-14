/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.proyecto.taller1;

/**
 *
 * @author Usuario
 */
public class Teclado extends DispositivosEntrada {

    private int idTeclado;
    private static int contadorTeclados = 0;

    public Teclado(String marca, String tipoDeEntrada, String color) {
        super(marca, tipoDeEntrada, color);
        this.idTeclado = ++Teclado.contadorTeclados;

    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado= " + idTeclado + " ,marca= " + super.getMarca() + ", Tipo de entrada= " + super.getTipoDeEntrada() + ", color = "+ super.getColor() + '}';
    }

}