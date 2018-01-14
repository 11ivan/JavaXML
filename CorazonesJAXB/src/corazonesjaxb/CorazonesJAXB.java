/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corazonesjaxb;

import java.io.File;

/**
 *
 * @author icastillo
 */
public class CorazonesJAXB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GestoraCorazones gestoraCorazones=new GestoraCorazones();
        File corazoncitos1 = new File(".//src//atomos.xml");
        File corazoncitos2 = new File(".//src//masatomos.xml");
        
        // Cargamos el XML mediante unmarshaling
          gestoraCorazones.abrirListaPersonasJAXB(corazoncitos1);

        // Comprobamos que se ha cargado
//        ma.recorreListaAtomos();
          gestoraCorazones.cargaListaPersonas();
          
        //Y lo asignamos a un array
          
        // Cargamos el XML mediante unmarshaling
          gestoraCorazones.abrirListaPersonasJAXB(corazoncitos2);

        // Comprobamos que se ha cargado
//        ma.recorreListaAtomos();
          gestoraCorazones.cargaListaPersonas();
          
        //Y lo asignamos a un array
                
        
        
        
        // Ahora vamos a ordenar la lista de personas
        
        
               
        
        // Y generamso un nuevo XML mediante marshaling
//        ma.guardarListaAtomos(destino);

    }
    
}
