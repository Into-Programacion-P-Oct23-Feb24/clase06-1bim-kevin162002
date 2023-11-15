/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();
        cadena = cadena.toLowerCase();
        
        switch(cadena){
            case "lunes":
                System.out.printf("%s\n Es el primer dia "
                        + "de la semana", cadena.toLowerCase());
                break;
            
            case "martes":
                System.out.printf("%s\n Es el segundo dia de "
                        + "la semana", cadena.toLowerCase());
                break;
                
            case "miercoles":
                System.out.printf("%s\n es el tercer dia de "
                        + "la semana", cadena.toLowerCase());
                break;
                
            case "jueves":
                System.out.printf("%s\n Es el cuarto dia "
                        + "de la semana", cadena.toLowerCase());
                break;    
                
            case "viernes":
                System.out.printf("%s\n Es el quinto dia "
                        + "de la semana", cadena.toLowerCase());
                break;
                
            case "sabado":    
                System.out.printf("%s\n Es el sexto dia "
                        + "de la semana", cadena.toLowerCase());
                break;
            
            case "domingo":    
                System.out.printf("%s\n Es el septimo dia "
                        + "de la semana", cadena.toLowerCase());
                break;
                
             
            default:
                System.out.println("ninguna de las anteriores");
                break;
        }
        
    }
}
