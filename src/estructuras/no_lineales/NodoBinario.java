/*
 * -------------------------------------------------------------------------
 * NodoBinario.java                                     Autor: Yimmy
 * Descripcion: TAD Nodo Binario, representa una estructura que consta de 
 * de tres atributos, un para el dato o contenido, y los otros dos son 
 * referencias o enlaces a otros Nodos Binarios.
 * Estructuras de Datos en java                            Santa Cruz 2018
 * -------------------------------------------------------------------------
 */

package estructuras.no_lineales;

/**
 * Un nodo binario es la representación de un elemento en un conjunto de muchos
 * elementos del mismo tipo. Por ello que se usa el enfoque recursivo.
 * @author Yimmy
 * @version 1.0
 * @param <T> variable de tipo, puede ser cualquiera, ejemplo T = String
 */
public class NodoBinario<T> {
    private T dato;
    private NodoBinario<T> hijoIzquierdo;
    private NodoBinario<T> hijoDerecho;

    /**
     *
     * @param dato
     * @param hijoIzquierdo
     * @param hijoDerecho
     */
    public NodoBinario(T dato, NodoBinario<T> hijoIzquierdo, NodoBinario<T> hijoDerecho) {
        this.dato = dato;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoDerecho = hijoDerecho;
    }

    /**
     *
     * @param dato
     */
    public NodoBinario(T dato) {
        this(dato, null, null);
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoBinario<T> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoBinario<T> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoBinario<T> getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoBinario<T> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
    public boolean tieneHijoIzquierdo() {
        return this.hijoIzquierdo != null;
    }
    
    public boolean tieneHijoDerecho() {
        return this.hijoDerecho != null;
    }
    
    public boolean esHoja() {
        return this.hijoIzquierdo == null && this.hijoDerecho == null;
    }
}
