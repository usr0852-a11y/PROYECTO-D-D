package net.salesianoslacuesta.guerrero;

import net.salesianoslacuesta.guerrero.Guerrero;
import net.salesianoslacuesta.personaje.Personaje;

public class Guerrero extends Personaje {
private String arma;

public Guerrero(String nombre, int nivel, String arma) {
    super(nombre, nivel);
    this.arma = arma;
}

}