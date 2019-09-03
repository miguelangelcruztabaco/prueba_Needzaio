
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
public class punto_2 {
    public void punto2(){
                 String linea;
                 //DECLARACION DE VARIABLE STRING LLAMADA LINEA QUE VALDRA CADA LINEA DEL TXT
                 File archivo = null;
                 // DECLARACION DE VARIABLE TIPO BUFFERREDREADER
                 BufferedReader br= null;
                 //DECALARACION DE VARIABLE DE TIPO ARCHIVO
                 FileReader fr = null;
                 int contador=0;
                try {
                    archivo = new File ("datos.txt");
                    new FileReader (archivo);
                    br = new BufferedReader(new FileReader (archivo));
                    /*PERMITE SABER CUANDO LA LINEA YA ESTA NULA , SIGNIFICA QUE TERMINO DE RECORRER
                     EL ARCHIVO.*/
                    while((linea=br.readLine()) != null){
                        //TOME EKL DATO DEL TXT machineID y lo mostre ya que este valor correponde 
                        // a la aeronave y es unico
                        /*en cada uno de lo condicionales evaluo las caracteristicas o los atributos DE LOS OBJETOS
                        que para cada caso voy a usar*/
                        if(linea.contains("machineID"))
                            //Id de la maquina
                            System.out.println("El Id de la maquina es: "+ linea);
                        //fecha total de los servicios (FECHA DE INICIO)
                        else if(linea.contains("dateInit"))
                           
                            System.out.println("Fecha de inicio: "+ linea);
                        else if(linea.contains("dateFinish"))
                             //fecha total de los servicios (FECHA DE FIN)
                            System.out.println("Fecha de finalizacion");
                        
                        if(linea.contains("maintHistoryID")){
                            System.out.println(contador+" :Identificador del servicio "+ linea);
                            //este contador me permite contar en numero de servicios por aeronave
                            contador++;
                        }
                        
                        else if(linea.contains("maintTaskID"))
                            System.out.println("Identificador del 'proceso' "+ linea);
                        else if(linea.contains("dateStart"))
                            //Fecha de inicio del subproceso
                            System.out.println("DIA  inicio "+ linea);
                        else if(linea.contains("dateEnd"))
                            //FEcha de fin del subproceso
                            System.out.println("DIA fin "+linea);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
    }
}

    

