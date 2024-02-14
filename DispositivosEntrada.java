/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.proyecto.taller1;

public class DispositivosEntrada {

    private String marca;
    private String tipoDeEntrada;
    private String color;

    public DispositivosEntrada(String marca, String tipoDeEntrada, String color) {
        this.marca = marca;
        this.tipoDeEntrada = tipoDeEntrada;
        this.color= color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
