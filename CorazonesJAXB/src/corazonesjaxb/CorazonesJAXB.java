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
                ManejadorAtomos ma = new ManejadorAtomos();
        File origen = new File(".//src//atomos.xml");
        File destino = new File(".//src//masatomos.xml");
        // Cargamos el XML mediante unmarshaling
        ma.abrirListaAtomosJAXB(origen);
        // Comprobamos que se ha cargado
        ma.recorreListaAtomos();
        // Ahora vamos a a?adir otro átomo
        Atomo nuevoAtomo = new Atomo();
        nuevoAtomo.setNombre("Mentirio");
        nuevoAtomo.setSimbolo("Mt");
        nuevoAtomo.setNumeroAtomico(111);
        ma.anadirAtomo (nuevoAtomo);
        // Y generamso un nuevo XML mediante marshaling
        ma.guardarListaAtomos(destino);

    }
    
}
