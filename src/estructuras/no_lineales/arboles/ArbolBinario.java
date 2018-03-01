/*
 * -------------------------------------------------------------------------
 * ArbolBinario.java                                     Autor: yimmy
 * Descripcion: 
 * Estructuras de Datos en java                            Santa Cruz 2018
 * -------------------------------------------------------------------------
 */
package estructuras.no_lineales.arboles;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author yimmy
 */
public class ArbolBinario<T extends Comparable<T>> implements Arbol<T>{
    
    NodoBinario<T> raiz;
    
    protected boolean esNodoVacio(NodoBinario<T> nodo) {
        return nodo == null;
    }

    @Override
    public boolean insertar(T dato) {
        if (esVacio()) {
            this.raiz = new NodoBinario<>(dato);
            return true;
        }
        
        NodoBinario<T> nodoAnterior = null;
        NodoBinario<T> nodoActual = this.raiz;
        
        while (!esNodoVacio(nodoActual)) {            
            nodoAnterior = nodoActual;
            if (dato.compareTo(nodoActual.getDato()) > 0) {
                nodoActual = nodoActual.getHijoDerecho();
            } else if (dato.compareTo(nodoActual.getDato()) < 0) {
                nodoActual = nodoActual.getHijoIzquierdo();
            } else {
                return false;
            }
        }
        
        NodoBinario<T> nuevoNodo = new NodoBinario<>(dato);
        if (dato.compareTo(nodoAnterior.getDato()) > 0) {
            nodoAnterior.setHijoDerecho(nuevoNodo);
        } else {
            nodoAnterior.setHijoIzquierdo(nuevoNodo);
        }
        
        return true;
    }
    
    /**
     * Inserta un nuevo elemento al árbol de manera recursiva.
     * @param dato es el elemento a ser insertado
     * @return {@code true} si el dato se ha insertado correctamente,
     * {@code false} en otro caso
     */
    public boolean insertarRecursivo(T dato) {
        try {
            this.raiz = insertarR(dato, this.raiz);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private NodoBinario<T> insertarR(T dato, NodoBinario<T> nodo) throws Exception {
        if (esNodoVacio(nodo)) {
            return new NodoBinario<>(dato);
        }
        
        if (dato.compareTo(nodo.getDato()) < 0) {
            nodo.setHijoIzquierdo(insertarR(dato, nodo.getHijoIzquierdo()));
        } else if (dato.compareTo(nodo.getDato()) > 0) {
            nodo.setHijoDerecho(insertarR(dato, nodo.getHijoDerecho()));
        } else {
            throw new Exception();
        }
        
        return nodo;
    }

    @Override
    public boolean eliminar(T dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T buscar(T dato) {
        if (esVacio()) {
            return null;
        }
        
        NodoBinario<T> nodoAnterior = null;
        NodoBinario<T> nodoActual = this.raiz;
        
        while (!esNodoVacio(nodoActual)) {            
            nodoAnterior = nodoActual;
            if (dato.compareTo(nodoActual.getDato()) > 0) {
                nodoActual = nodoActual.getHijoDerecho();
            } else if (dato.compareTo(nodoActual.getDato()) < 0) {
                nodoActual = nodoActual.getHijoIzquierdo();
            } else {
                return nodoActual.getDato();
            }
        }
        
        return null;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int altura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esVacio() {
        return this.raiz == null;
    }

    @Override
    public void vaciar() {
        this.raiz = null;
    }

    @Override
    public List<T> recorridoPorNiveles() {
        List<T> recorrido = new LinkedList<>();
        
        if (esVacio()) {
            return recorrido;
        }
        
        Queue<T> cola = new LinkedList<>();
        
        return recorrido;
    }

    @Override
    public List<T> recorridoEnOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> recorridoPreOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> recorridoPostOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
