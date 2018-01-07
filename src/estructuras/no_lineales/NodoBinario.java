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
     * Constructor parametrizado.
     * @param dato es el elemento que contendrá el nuevo nodo
     * @param hijoIzquierdo referencia a otro nodo
     * @param hijoDerecho referencia a otro nodo
     */
    public NodoBinario(T dato, NodoBinario<T> hijoIzquierdo, NodoBinario<T> hijoDerecho) {
        this.dato = dato;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoDerecho = hijoDerecho;
    }

    /**
     * Constructor parametrizado.
     * @param dato es el elemento que contendrá el nuevo nodo
     */
    public NodoBinario(T dato) {
        this(dato, null, null);
    }

    /**
     * Obtiene el elemento del nodo.
     * @return {@code dato} el cual es el contenido del elemento
     */
    public T getDato() {
        return dato;
    }

    /**
     * Establece un valor para el contenido del nodo.
     * @param dato es el contenido que se establecerá para el nodo
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * Obtiene la referencia al hijo izquierdo del nodo.
     * @return {@code hijoIzquierdo}, referencia a otro nodo
     */
    public NodoBinario<T> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    /**
     * Establece la referencia al hijo izquierdo del nodo.
     * @param hijoIzquierdo el nodo que será referenciado como hijo izquierdo
     */
    public void setHijoIzquierdo(NodoBinario<T> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    /**
     * Obtiene la referecia al hijo derecho del nodo.
     * @return {@code hijoDerecho}, referencia a un nodo
     */
    public NodoBinario<T> getHijoDerecho() {
        return hijoDerecho;
    }

    /**
     * Establece la referencia al hijo derecho del nodo.
     * @param hijoDerecho el nodo que será referenciado como hijo derecho
     */
    public void setHijoDerecho(NodoBinario<T> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
    /**
     * Verifica si el nodo tiene hijo izquierdo.
     * @return {@code true} si el nodo tiene hijo izquierdo, {@code false} si no
     * lo tiene
     */
    public boolean tieneHijoIzquierdo() {
        return this.hijoIzquierdo != null;
    }
    
    /**
     * Verifica si el nodo tiene hijo derecho.
     * @return {@code true} si el nodo tiene hijo derecho, {@code false} si no
     * lo tiene
     */
    public boolean tieneHijoDerecho() {
        return this.hijoDerecho != null;
    }
    
    /**
     * Verifica si el nodo es una hoja.
     * @return {@code true} si el nodo es una hoja, {@code false} si no lo es
     */
    public boolean esHoja() {
        return this.hijoIzquierdo == null && this.hijoDerecho == null;
    }
}
