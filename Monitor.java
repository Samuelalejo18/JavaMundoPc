/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.proyecto.taller1;

/**
 *
 * @author Usuario
 */
public class Monitor {
    private static int contadorMonitores=0;
    private String marca;
    private String tamaño;
    private int idMonitor;

    public Monitor(String marca, String tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.idMonitor= ++Monitor.contadorMonitores;
    }    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
    
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor [marca= " + marca + ", tamaño= " + tamaño + ", idMonitor= " + idMonitor + "]";
    }

    
    
}