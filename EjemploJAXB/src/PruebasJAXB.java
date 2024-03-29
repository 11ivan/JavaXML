/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package pruebas.jaxb;

//import java.io.File;
import java.io.File;

import org.example.newxmlschema.Atomo;

//import beans.*;

/**
 *
 * @author Leo
 */
public class PruebasJAXB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejadorAtomos ma = new ManejadorAtomos();
        File origen = new File(".//src//atomos.xml");
        File destino = new File(".//src//masatomos.xml");
        // Cargamos el XML mediante unmarshaling
        ma.abrirListaAtomosJAXB(origen);
        // Comprobamos que se ha cargado
        ma.recorreListaAtomos();
        // Ahora vamos a a?adir otro �tomo
        Atomo nuevoAtomo = new Atomo();
        nuevoAtomo.setNombre("Mentirio");
        nuevoAtomo.setSimbolo("Mt");
        nuevoAtomo.setNumeroAtomico(111);
        ma.anadirAtomo (nuevoAtomo);
        // Y generamso un nuevo XML mediante marshaling
        ma.guardarListaAtomos(destino);
    }
}
