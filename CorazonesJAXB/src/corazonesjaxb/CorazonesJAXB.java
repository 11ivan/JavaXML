/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corazonesjaxb;

import generated.Persona;
import java.io.File;
import java.util.ArrayList;

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
        File corazoncitos1 = new File(".//src//corazonesjaxb//Corazones1.xml");
        File corazoncitos2 = new File(".//src//corazonesjaxb//Corazones2.xml");
        File corazoncitosOrdenado = new File(".//src//corazonesjaxb//CorazonesOrdenado.xml");
        ArrayList<Persona> arrayPersonas1;
        ArrayList<Persona> arrayPersonas2;
        UtilArray utilArray=new UtilArray();
        ArrayList<Persona> arrayPersonasOrdenado=new ArrayList<Persona>();
        
        // Cargamos el XML mediante unmarshaling
        gestoraCorazones.abrirListaPersonasJAXB(corazoncitos1);

        // Comprobamos que se ha cargado
        gestoraCorazones.cargaListaPersonas();
          
        //Y lo asignamos a un array
        arrayPersonas1=gestoraCorazones.getListaPersonas();
        
        // Cargamos el XML mediante unmarshaling
        gestoraCorazones.abrirListaPersonasJAXB(corazoncitos2);

        // Comprobamos que se ha cargado
        gestoraCorazones.cargaListaPersonas();
          
        //Y lo asignamos a un array
        arrayPersonas2=gestoraCorazones.getListaPersonas();
                   
        // Ahora vamos a ordenar la lista de personas
        arrayPersonasOrdenado=utilArray.merge(arrayPersonas1, arrayPersonas2);                          
        
        // Y generamso un nuevo XML mediante marshaling
        gestoraCorazones.listaCorazoncitos.setPersona(arrayPersonasOrdenado);
        gestoraCorazones.guardarListaPersonas(corazoncitosOrdenado);
    }
    
}
