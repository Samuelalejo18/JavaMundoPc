/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.proyecto.taller1;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Orden {

    private static int contadorOrdenes = 0;
    private int idOrden;
    private ArrayList<Computadora> computadoras;
    private String computadorasOrden;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new ArrayList<>();
    }

    public void agregarComputadora(Computadora computadora) {
        computadoras.add(computadora);

    }

    public void mostrarOrden() {

        for (Computadora computadora : computadoras) {
            computadorasOrden = "\n{" + computadora.toString() + " }";

        }
        System.out.println(" orden " + idOrden + ", computadora/s: " + computadorasOrden);
    }
    
    /* 
    
     public Computadora busqueda(String busqueda){
          for (Computadora Computadora : computadoras) {
              if (Computadora.getNombre().equalsIgnoreCase(busqueda)) {
                  return Computadora;
              }
          }
          return null;
      }
      public ArrayList<Computadora> mostrarBusqueda(){
          return computadoras;
      }
      */
}

