/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corazonesjaxb;

import generated.Persona;
import java.io.File;
import java.io.StringWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author icastillo
 */
public class GestoraCorazones {
        Persona listaPersonas;
        
    public void abrirListaAtomosJAXB (File archivoXML){
        JAXBContext contexto;
        try {
            contexto = JAXBContext.newInstance(Persona.class);
            Unmarshaller u = contexto.createUnmarshaller();
            listaPersonas = (Persona) u.unmarshal(archivoXML);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void recorreListaAtomos(){
        AtomoEscribible atomoTuneao;
        List<Persona> miListaAtomos = listaPersonas.getAtomo();
        for(Persona unAtomo:miListaAtomos){
            atomoTuneao = new AtomoEscribible(unAtomo);
            System.out.println("\nSiguiente elemento\n----------------------------------------------");
            System.out.println(atomoTuneao.getTodo());
        }
    }
    public void anadirAtomo(Persona nuevo){
        listaPersonas.getAtomo().add(nuevo);
    }
    public void guardarListaAtomos(File archivoXML){
        JAXBContext contexto;
        try {
            contexto = JAXBContext.newInstance(Persona.class);
            Marshaller marshalero = contexto.createMarshaller();
            marshalero.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter escribiente = new StringWriter();
            marshalero.marshal(listaPersonas, archivoXML);
            // ahora lo marshaleamos a un stream para visualizarlo
            marshalero.marshal(listaPersonas, escribiente);
            System.out.println("-----------------");
            System.out.println("Object2XML:");
            System.out.println(escribiente.toString());
            System.out.println("-----------------");
        } catch (JAXBException ex) {
            Logger.getLogger(GestoraCorazones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
