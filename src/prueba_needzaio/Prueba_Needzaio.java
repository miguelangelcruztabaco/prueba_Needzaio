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
                System.out.println("------------------------PUNTO 1 :--------------------------");
                leer();
                System.out.println("\n\n\n\n");
                System.out.println("------------------------PUNTO 2 :--------------------------");
                punto_2 ob = new punto_2();
                ob.punto2();
                
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
                        //EN ESTA LINEA VERIFICO SI EN LA LECTURA APARECE UNA NUEVA AERONAVE, EVALUANDO
                        // ESTA CONDICICION POR MEDIO DE (CONTAINS) LO QUE ME PERMITE VERIFICAR
                        // SI LA LINEA DE LECTURA TIENE ALGO RELACIONADO CON CALLSING, LO QUE DIRIA QUE ES UNA NAVE NEUVA
                        if(linea.contains("callSing")){
                            //EVALUO LA VARIABLE CANTIDAD_SERVICIOS PARA PODER EVALUAR CUANTOS SERVICIOS TUVO CADA
                            // AERONAVE
                            if(cantidad_servicios > 0)
                                System.out.println("La cantidad de serivios fueron : "+ cantidad_servicios+ "\n\n\n");
                            // SI LINEA ES IGUAL CALLSING ENTONCES SIGNIFICA QUE ES UNA NUEVA NAVE Y INICIALIZA
                            // LA VARIABLE CANTIDAD_SERVICIOS EN 0 PARA QUE ASI EVALUE LA SIGUEITNE NAVVE
                            cantidad_servicios =0;
                            //LA VARIABLE N ME PERMITE CONTAR EL UNMERO DE NAVES REGISTRADAS
                            n++;
                            System.out.println("aeronave "+n+" identificada por:  \n "+linea);

                        }
                        //SI LA LINEA ES IGUAL A mainHistoryID SIGNIFICA QUE ES UN NUEVO SERVICIO PARA LA NAVE QUE 
                        // SE ESTA EVALUANDO, ENTONCES SE INCREMENTA EL CONTADOR DE SERVICIOS
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
