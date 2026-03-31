package net.salesianoslacuesta.personaje;

public class Personaje {
private String nombre;
private int nivel;
private int energia;

private static int totalPersonajes;

public Personaje(String nombre, int nivel) {
    this.nombre = nombre;
    this.nivel = nivel;
    this.energia = 100;
    totalPersonajes++;
}

public String getNombre() {
    return nombre;
}

public int getNivel() {
    return nivel;
}

public int getEnergia() {
    return energia;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setNivel(int nivel) {
    this.nivel = nivel;
}

public void setEnergia(int energia) {
    this.energia = energia;
}

public void entrenar(int x) {
    if(x <= 0) {
        System.out.println("No se puede entrenar 0 o menos niveles.");
       
    } else {
        this.nivel += x;
    }
}

public void descansar(int x) {
    if(x <= 0) {
        System.out.println("No se puede aumentar 0 o menos energia");
    } else if (this.energia + x> 100){
     System.out.println("La energia no puede superar los 100");
     this.energia = 100;
    } else {
        this.energia += x;
    }
}

public void gastarEnergia(int x) {
    this.energia -= x;
    if (this.energia < 0 ) {
        this.energia = 0;
    }
}

public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Nivel: " + nivel);
    System.out.println("Energia: " + energia);

}

public static void mostrarTotalPersonajes() {
    System.out.println("Total de personajes: " + totalPersonajes);
}

}