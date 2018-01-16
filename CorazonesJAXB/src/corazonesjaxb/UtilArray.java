/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corazonesjaxb;

import generated.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icastillo
 */
public class UtilArray {
    
   /*public Persona[] mergeSort(Persona[] arrayPersonas1, Persona[] arrayPersonas2){
        
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
    }*/
    
    
    public ArrayList<Persona> merge(ArrayList<Persona> arrayPersonas1, List<Persona>arrayPersonas2){
        ArrayList<Persona> listaOrdenada=new ArrayList<Persona>();
        int index1=0;
        int index2=0;
        int seHaPasado=0;
        Boolean yoTeDiga=true;

        do{ 
            //Comprobamos si se ha pasado el indice de algun array
            if(index1==arrayPersonas1.size()){
                seHaPasado=1;
            }else if(index2==arrayPersonas2.size()){
                seHaPasado=2;
            }
                      
            switch(seHaPasado){
                case 0:
                    if(arrayPersonas1.get(index1).getID()<arrayPersonas2.get(index2).getID()){
                        listaOrdenada.add(arrayPersonas1.get(index1));
                        index1++;
                    }else{
                        listaOrdenada.add(arrayPersonas2.get(index2));
                        index2++;
                    }  
                    break;
                    
                case 1:
                        //Rellenamos con los que quedan del array2
                        do{
                            listaOrdenada.add(arrayPersonas2.get(index2));
                            index2++;
                        }while(index2!=arrayPersonas2.size());
                        
                        yoTeDiga=false;
                    break;
                    
                case 2:
                        //Rellenamos con los que quedan del array1
                        do{
                            listaOrdenada.add(arrayPersonas1.get(index1));
                            index1++;
                        }while(index1!=arrayPersonas1.size());
                        
                        yoTeDiga=false;
           
                        break;
            }
        }while(yoTeDiga);
        
        return listaOrdenada;
    }
    
    
}
