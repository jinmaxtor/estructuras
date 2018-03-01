/*
 * -------------------------------------------------------------------------
 * Arbol.java                                     Autor: Yimmy Quispe Yujra
 * Descripcion: 
 * Estructuras de Datos en java                            Santa Cruz 2018
 * -------------------------------------------------------------------------
 */
package estructuras.no_lineales.arboles;

import java.util.List;

/**
 * 
 * @author Yimmy Quispe Yujra
 * @version 1.0
 * @param <T> variable de tipo, puede ser cualquiera, ejemplo T = String
 */
public interface Arbol<T> {

    /**
     * Inserta un nuevo elemento al árbol.
     * @param dato es el elemento a ser insertado
     * @return {@code true} si el dato se ha insertado correctamente,
     * {@code false} en otro caso
     */
    boolean insertar(T dato);

    /**
     * Elimina un elemento del árbol.
     * @param dato es el elemento a ser eliminado
     * @return {@code true} si el dato se ha eliminado correctamente,
     * {@code false} en otro caso
     */
    boolean eliminar(T dato);

    /**
     * Permite la busqueda de un elemento en el árbol.
     * @param dato es el elemento a ser buscado
     * @return {@code dato} el elemento buscado si se encuentra en el árbol,
     * {@code null} en otro caso
     */
    T buscar(T dato);

    /**
     * Proporciona el tamaño del árbol, esto es, la cantidad de elementos o
     * nodos con los que cuenta el árbol.
     * @return {@code n} donde n es el número de elementos que hay en el árbol
     */
    int size();

    /**
     * Proporciona la altura del árbol, esto es, la distancia más larga desde la
     * raíz del árbol hasta una de las hojas.
     * @return {@code h} donde h es la altura del árbol
     */
    int altura();

    /**
     * Verifica si el árbol esta vacio.
     * @return {@code true} si el árbol esta vacio, esto es, no tiene ni un
     * elemento, {@code false} en otro caso
     */
    boolean esVacio();

    /**
     * Elimina todos los elementos del árbol dejandolo vacio.
     */
    void vaciar();

    /**
     * Genera una lista con los elementos generados por el recorrido realizado
     * por niveles.
     * @return {@code List<T>} con los elementos del árbol
     */
    List<T> recorridoPorNiveles();

    /**
     * Genera una lista con los elementos generados por el recorrido realizado
     * en orden.
     * @return {@code List<T>} con los elementos del árbol
     */
    List<T> recorridoEnOrden();

    /**
     * Genera una lista con los elementos generados por el recorrido realizado
     * de forma preorden.
     * @return {@code List<T>} con los elementos del árbol
     */
    List<T> recorridoPreOrden();

    /**
     * Genera una lista con los elementos generados por el recorrido realizado
     * de forma postorden.
     * @return {@code List<T>} con los elementos del árbol
     */
    List<T> recorridoPostOrden();
}
