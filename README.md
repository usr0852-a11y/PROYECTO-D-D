# PROYECTO-D-D
Proyecto java
Este proyecto implementa un sistema de personajes inspirado en juegos de rol, utilizando herencia, polimorfismo, métodos sobrescritos y una clase ejecutable que demuestra el funcionamiento completo. 

Dentro del proyecto nos pidieron la clase personaje:
- nombre  
- nivel  
- energía  
- contador estático de personajes

 Métodos principales:
- entrenar(int niveles)  
- gastarEnergia(int cantidad)  
- descansar(int cantidad)  
- mostrarInfo()  
- mostrarTotalPersonajes() (estático)

---

- Guerrero (extends Personaje)
Atributos y métodos:
- arma  
- constructor con nombre, nivel y arma  
- sobrescribe mostrarInfo()  
- ataquePesado(): gasta 15 de energía  

---

- Mago (extends Personaje)
Atributos y métodos:
- elemento  
- constructor con nombre, nivel y elemento  
- sobrescribe mostrarInfo() mostrando solo nivel y elemento  
- ataqueElemental(): gasta 25 de energía  

---

- Clase App (Ejecutable)

La clase App realiza las siguientes acciones:

1. Crea un Personaje viajero (nivel inicial 3)  
2. Lo entrena, gasta energía y muestra su información  
3. Crea un Guerrero, ejecuta un ataque pesado, descansa y muestra info  
4. Crea un Mago, lanza un ataque elemental, entrena y muestra info  
5. Muestra el total de personajes creados  
6. Crea un array con los tres personajes y recorrerlo




