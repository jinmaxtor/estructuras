/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import estructuras.fundamentos.asociaciones.Profesor;
import estructuras.fundamentos.asociaciones.Universidad;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Yimmy
 * @version 
 */
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad uagrm = new Universidad("Universidad Autónoma Gabriel René Moreno");
        Profesor mario = new Profesor("Mario Gimber Zeballos Cruz", Profesor.Rank.INSTR);
        Profesor roberto = new Profesor("Carlos Roberto Vaca Pinto", Profesor.Rank.PROF);
        Profesor gino = new Profesor("Gino Barrozo Viruez", Profesor.Rank.PROF);
        Profesor juan = new Profesor("Juan Carlos Contreras Villegas", Profesor.Rank.PROF);
        Profesor josue = new Profesor("Josué Veizaga", Profesor.Rank.PROF);
        Profesor carlos = new Profesor("Carlos Miranda Carrasco", Profesor.Rank.PROF);
        Profesor braulio = new Profesor("Braulio Caceres Chacon", Profesor.Rank.PROF);
        Profesor mirian = new Profesor("Mirian Guzman de Molina", Profesor.Rank.PROF);
        Profesor claure = new Profesor("Claure Medrano de Oropeza", Profesor.Rank.PROF);
        Set<Profesor> miembros = new HashSet<>();
        Collections.addAll(miembros, mario, roberto, gino, juan, josue);
        uagrm.adicicionarDepartamento("Informatica", miembros);
        miembros.clear();
        Collections.addAll(miembros, carlos, braulio);
        uagrm.adicicionarDepartamento("Matemáticas", miembros);
        miembros.clear();
        Collections.addAll(miembros, mirian, claure);
        uagrm.adicicionarDepartamento("Inglés", miembros);
        
    }
    
}
