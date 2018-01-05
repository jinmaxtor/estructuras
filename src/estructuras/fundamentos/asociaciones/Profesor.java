/*
 * -------------------------------------------------------------------------
 * Profesor.java                                     Autor: Yimmy
 * Descripcion: Clase utilizada para representar las asociaciones.
 * Estructuras de Datos en java                            Santa Cruz 2018
 * -------------------------------------------------------------------------
 */

package estructuras.fundamentos.asociaciones;

/**
 * Clase Profesor, representa una abstracción simple de un profesor.
 * @author Yimmy Quispe Yujra
 * @version 1.0
 */
public class Profesor extends Persona{
    
    public static enum Rank {INSTR, ASST, ASSOC, PROF};
    
    private Rank rank;
    
    public Profesor(String nombre, Rank rank) {
        super(nombre);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
    
}
