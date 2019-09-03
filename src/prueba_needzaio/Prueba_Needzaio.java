/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_needzaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author miguelangel
 */
public class Prueba_Needzaio {    
    public static void main(String Ars[]){
    leer();
    }
    
    public static void leer(){
         String linea;
         //DECLARACION DE VARIABLE STRING LLAMADA LINEA QUE VALDRA CADA LINEA DEL TXT
         File archivo = null;
         // DECLARACION DE VARIABLE TIPO BUFFERREDREADER
         BufferedReader br= null;
         //DECALARACION DE VARIABLE DE TIPO ARCHIVO
         FileReader fr = null;
        int n =0;
        int cantidad_servicios = 0;
        
        try {
            archivo = new File ("datos.txt");
            new FileReader (archivo);
            br = new BufferedReader(new FileReader (archivo));
            /*PERMITE SABER CUANDO LA LINEA YA ESTA NULA , SIGNIFICA QUE TERMINO DE RECORRER
             EL ARCHIVO.*/
            while((linea=br.readLine()) != null){
                if(linea.contains("callSing")){
                    //VARIABLE QUE CUENTA EL NUMERO DE NAVES (SE AUTO INCREMENTA)
                    if(cantidad_servicios > 0)
                        System.out.println("La cantidad de serivios fueron : "+ cantidad_servicios+ "\n\n\n");
                      
                    cantidad_servicios =0;
                    n++;
                    System.out.println("aeronave "+n+" identificada por:  \n "+linea);
                    
                }
                else if(linea.contains("maintHistoryID")){
                    cantidad_servicios++;
                }
            }
            System.out.println("La cantidad de serivios fueron : "+ cantidad_servicios);
            //MUESTRA EL NUMERO DE NAVES QUE SE REGISTRAN EN EL TXT
            System.out.println("\n\n\n NUMERO DE NAVES: "+ n);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    
   
}
