/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corazonesjaxb;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import generated.Persona;

/**
 *
 * @author icastillo
 */
public class UtilArray {
    
    //PSEUDOCODIGO METODO MERGE
        //
    
    
    public Persona[] mergeSort(Persona[] arrayPersonas1, Persona[] arrayPersonas2){
        
        Persona[] arrayAux1=new Persona[arrayPersonas1.length];
        Persona[] arrayAux2=null;
        Persona[] arrayPersonasOrdenado=null;
        
        //Si la longitud del array es mayor que dos lo partimos en dos array
        if(arrayAux1.length>2){

        }else{
            //Fusionamos 
        } 
        
        
        
        return arrayPersonasOrdenado;
    }
  
    
    public Persona[] split(int inicio, int longitud, Persona[] arrayAPartir){
        Persona[] arrayPersonas=new Persona[longitud-inicio];
        
        for(int i=inicio;i<longitud;i++){
            arrayPersonas[i]=arrayAPartir[i];
        }
        
        return arrayPersonas;
    }
    
    
    public Persona[] ordenaPorMitades(Persona[] arrayPersonas){
        Persona[] izq=split(0, arrayPersonas.length/2, arrayPersonas);
        Persona[] decha=split(arrayPersonas.length/2, arrayPersonas.length, arrayPersonas);
        Persona[] arrayOrdenado=new Persona[arrayPersonas.length];        
        
        if(izq.length>2){
            ordenaPorMitades(izq);
        }else{
            if(izq[0].getID()>izq[1].getID()){
                Persona aux1=izq[0];
                izq[0]=izq[1];
                izq[1]=aux1;
            }
        }
        
        if(decha.length>2){
            ordenaPorMitades(decha);
        }else{
            if(decha[0].getID()>decha[1].getID()){
                Persona aux2=decha[0];
                decha[0]=decha[1];
                decha[1]=aux2;
            }
        }    
        
        arrayOrdenado=fusionaOrdenado(izq, decha);
        
        return arrayOrdenado;
    }
    
    
    public Persona[] fusionaOrdenado(Persona[] arrayPersonas1, Persona[] arrayPersonas2){
        Persona[] ordenado=new Persona[arrayPersonas1.length+arrayPersonas2.length];
        
        for(int i=0;i<ordenado.length;i++){
            
            if(){
                
            }
            
        }
        
        return ordenado;
    }
    
    
}
