/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corazonesjaxb;

import generated.Corazoncitos;
import generated.Persona;
import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
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
        Corazoncitos listaCorazoncitos;
        ArrayList<Persona> listadoPersonas;
        
    public void abrirListaPersonasJAXB (File archivoXML){
        JAXBContext contexto;
        try {
            contexto = JAXBContext.newInstance(Corazoncitos.class);
            Unmarshaller u = contexto.createUnmarshaller();
            listaCorazoncitos = (Corazoncitos) u.unmarshal(archivoXML);
        }catch (JAXBException ex){
            //System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public void cargaListaPersonas(){
        listadoPersonas = new ArrayList<Persona>(listaCorazoncitos.getPersona());
    }
    
    public ArrayList<Persona> getListaPersonas(){
        return listadoPersonas;
    }
    

    public void addPersona(Persona nuevo){
        listaCorazoncitos.getPersona().add(nuevo);
    }

    /*public void setListaCorazoncitos(ArrayList<Persona> listaPersonas){
        listaCorazoncitos=(Corazoncitos)listaPersonas;
    }*/
    
    public void guardarListaPersonas(File archivoXML){
        JAXBContext contexto;
        try {
            contexto = JAXBContext.newInstance(Corazoncitos.class);
            Marshaller marshalero = contexto.createMarshaller();
            marshalero.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter escribiente = new StringWriter();
            marshalero.marshal(listaCorazoncitos, archivoXML);
            // ahora lo marshaleamos a un stream para visualizarlo
            marshalero.marshal(listaCorazoncitos, escribiente);
            System.out.println("-----------------");
            System.out.println("Object2XML:");
            System.out.println(escribiente.toString());
            System.out.println("-----------------");
        } catch (JAXBException ex) {
            Logger.getLogger(GestoraCorazones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
   
    
    
}
