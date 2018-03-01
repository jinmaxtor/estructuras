/*
 * -------------------------------------------------------------------------
 * Persona.java                                   Autor: Yimmy Quispe Yujra
 * Descripcion: Clase simple utilizada para ejemplificar las asociaciones
 * en clases java.
 * Estructuras de Datos en java                            Santa Cruz 2018
 * -------------------------------------------------------------------------
 */

package estructuras.fundamentos.asociaciones;

/**
 * Clase que representa una abstracción de una persona.
 * @author Yimmy Quispe Yujra
 * @version 1.0
 */
public class Persona {
    
    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}