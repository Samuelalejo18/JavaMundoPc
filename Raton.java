/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.proyecto.taller1;

/**
 *
 * @author Usuario
 */
public class Raton  extends DispositivosEntrada{
    
    private int idRaton;
    private static int contadorRatones = 0;

    public Raton(String marca, String tipoDeEntrada, String color) {
        super(marca, tipoDeEntrada, color);
        this.idRaton = ++Raton.contadorRatones;

    }

    public int getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton= " + idRaton + ", marca=" + super.getMarca() + ", Tipo de entrada= " + super.getTipoDeEntrada() + ", color ="+ super.getColor() + '}';
    }
}