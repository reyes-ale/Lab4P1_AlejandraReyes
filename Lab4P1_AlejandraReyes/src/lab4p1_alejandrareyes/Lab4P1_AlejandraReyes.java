package lab4p1_alejandrareyes;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Lab4P1_AlejandraReyes {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leer2 = new Scanner (System.in);
        System.out.println("* * * * * MENU * * * * *");
        System.out.println("1. Inversion especial");
        System.out.println("2. Balanza de cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("4. Salir del programa");
        System.out.print("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        while (opcion>0 && opcion<4){
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cadena: ");
                    String cadena = leer2.nextLine();
                    if (cadena.length()>=5){
                       String cad_inv = "";
                       String inv="";
                       
                     for (int i=0; i <cadena.length(); i++){
                          char caracter=cadena.charAt(i);
                          inv = caracter+inv;
                           if (caracter == ' '){
                                cad_inv+=inv;
                                inv="";
                            }
                        }
                        cad_inv = cad_inv + ' ' + inv;
                        System.out.println(cad_inv);
                    }
                    else{
                        System.out.println("Su cadena debe de tener al menos 5 caracteres");
                    }
                     
                           
                    
                    break;
                
                case 2:
                    System.out.println("Ingrese la cadena 1: ");
                    leer.nextLine();
                    String cadena1 = leer.nextLine();
                    System.out.println("Ingrese la cadena 2: ");
                    String cadena2 = leer.nextLine();
                    System.out.println("Ingrese la cadena 3: ");
                    String cadena3 = leer.nextLine();
                    int acumulador1 = 0;
                    int acumulador2 = 0; 
                    int acumulador3 = 0;
                    
                    for (int a=0; a < cadena1.length(); a++){
                            char caracter=cadena1.charAt(a);
                            int numero1 = caracter;
                            acumulador1+=numero1;
                   } 
                    
                    for (int a=0; a < cadena2.length(); a++){
                            char caracter=cadena2.charAt(a);
                            int numero2 = caracter;
                            acumulador2+=numero2;
                   } 
                   
                    for (int a=0; a < cadena3.length(); a++){
                            char caracter=cadena3.charAt(a);
                            int numero3 = caracter;
                            acumulador3+=numero3;
                    } 
                    
                    System.out.println("Peso cadena 1: " + acumulador1);
                    System.out.println("Peso cadena 2: " + acumulador2);
                    System.out.println("Peso cadena 3: " + acumulador3);
                    
                    if (acumulador1 > acumulador2 && acumulador1 > acumulador3){
                        System.out.println("La cadena 1 es mas pesada");
                    }
                    else if(acumulador2 > acumulador1 && acumulador2 > acumulador3){
                        System.out.println("La cadena 2 es mas pesada");
                    }
                    else if(acumulador3 > acumulador2 && acumulador3 > acumulador1){
                        System.out.println("La cadena 3 es mas pesada");
                    }
                    else if(acumulador1 == acumulador2 && acumulador2!=acumulador3){
                        System.out.println("Las cadenas 1 y 2 son igual de pesadas ");
                    }
                    else if(acumulador2 == acumulador3 && acumulador2!=acumulador1){
                        System.out.println("Las cadenas 2 y 3 son igual de pesadas ");
                    }
                    else if(acumulador1 == acumulador3 && acumulador3!=acumulador2){
                    System.out.println("Las cadenas 1 y 3 son igual de pesadas ");
                    }
                    else if(acumulador1==acumulador2 && acumulador1==acumulador3 && acumulador2==acumulador3){
                        System.out.println("Todas las cadenas tienen el mismo peso");
                    }
                    
                break; 
                    
                case 3:
                    System.out.println("Ingrese el mensaje que desea cifrar: ");
                    String messg = leer2.nextLine();
                    String esp="";
                    String letra= "";
                    if (messg != esp){
                    char caracter=' ';
                    int ascii=0;
                    
                     for (int a=0; a < messg.length(); a++){
                        caracter=messg.charAt(a);
                        ascii=(int)caracter+2;
                        caracter=(char)ascii;
                        letra+=caracter;
                     } 
                    }
                    else{
                        System.out.println("No puede ingresar una cadena vacia");
                    }
                     
                     System.out.println(letra);
                break;
            }
            System.out.println();
            System.out.println("* * * * * MENU * * * * *");
            System.out.println("1. Inversion especial");
            System.out.println("2. Balanza de cadenas");
            System.out.println("3. Cifrado de mensajes");
            System.out.println("4. Salir del programa");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            }
        
            
             
            
            
        }
        
    }
    

