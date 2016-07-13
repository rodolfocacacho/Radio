
import java.util.*;
import java.io.*;

/**
 * 
 */
public class Principal {
    public static void main(String[] args) {

    	Carro carro = new Carro();			

    	boolean estado = carro.getEstado();
    	boolean frecuencia = carro.getFrecuencia();
    	double emisora = carro.getEmisora();
    	String s = "";
    	String f = "";
    	String e = "";
    	int i = 0;
    	int r = 0;

		InputStreamReader reader = new InputStreamReader(System.in); /* cosultado de http://www.scit.wlv.ac.uk/~in8297/CP4044/workshops/w03.html */
        BufferedReader console = new BufferedReader(reader);			/* input de la consola convertido a int */
        Scanner input = new Scanner(System.in); 

    	while( i != 120){

    		if(estado == false){ 									/* verifica si el estado de encendido o apagado, para apagado es un menu diferente */
    			s = "[OFF]";

    	System.out.println("+--------------------------------------------+");
        System.out.println("|                 RADIO JAVA                 |");
    	System.out.println("+--------------------------------------------+");
        System.out.println("|   "+s+"  [  ]  [  ]                        |");
        System.out.println("|                                            |");
        System.out.println("|                                            |");
        System.out.println("|  (1)(2))(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)  |");
        System.out.println("+--------------------------------------------+");
        System.out.println("");
    	System.out.println("+--------------------------------------------+");
        System.out.println("|               INSTRUCCIONES                |");
    	System.out.println("+--------------------------------------------+");
        System.out.println("| INGRESE CARACTER PARA ACCIONAR	     |");
        System.out.println("|  [o] ENCENDER/APAGAR                       |");
        System.out.println("|  [a] CAMBIAR FRECUENCIA AM/FM		     |");
        System.out.println("|  [j] CAMBIAR EMISORA <-		     |");
        System.out.println("|  [k] CAMBIAR EMISORA ->		     |");
        System.out.println("|  [g] GUARDAR EMISORA                       |");
        System.out.println("|  [s] SELECCIONAR EMISORA                   |");
        System.out.println("|  [x] SALIR                                 |");
        System.out.println("|                                            |");
    	System.out.println("+--------------------------------------------+");
        System.out.println("");

    }

    try{										/* try y catch del input, solo funcionan los que estan definidos */
        	i = console.read();
        	System.out.print("");
        }
        
        catch(IOException o){
            System.exit(1);
        }
        catch(NumberFormatException o){
            System.exit(1);
        }
        System.out.print("\033[H\033[2J");		/* Consultado de http://stackoverflow.com/questions/2979383/java-clear-the-console*/
        System.out.flush();						/* se corre la consola hasta el tope , creo que no funciona en Windows, solo en consolas UNIX */


    		if (i == 111){						/* si se ingresa o = 111 en ASCII, se enciende o apaga la radio */
    			carro.ON_OFF();
    			estado = carro.getEstado();
    		}

    		if(estado == true){					/* si el estado de encendido es true, el radio esta ON */
    			s = "[ON]";

    		if (i == 97 && estado != false){	/* si se ingrea a = 97 y no esta apagada la radio, se cambia de AM a FM y visceversa */
    			carro.AM_FM();
    			frecuencia = carro.getFrecuencia();
    			emisora = carro.getEmisora();
    		}

    		if (i == 106 && estado != false){	/* si se ingrea j = 106 y no esta apagada la radio, se cambia la emisora hacia abajo */
    			boolean jk = false;
    			carro.Cambio_de_Emisora(jk);
    			emisora = carro.getEmisora();
    		}

    		if (i == 107 && estado != false){	/* si se ingrea k = 107 y no esta apagada la radio, se cambia la emisora hacia arriba */
    			boolean jk = true;
    			carro.Cambio_de_Emisora(jk);
    			emisora = carro.getEmisora();
    		}

    		
    		if (i == 103 && estado != false){	/* si se ingrea g = 103 y no esta apagada la radio, se cambia la emisora hacia arriba */
    	System.out.println("+--------------------------------------------+");
        System.out.println("|        INGRESE UN NUEMRO DEL 1 AL 12       |");
    	System.out.println("+--------------------------------------------+");
    			r = input.nextInt();
    			if (r >= 1 && r <= 12){
    				carro.Guardar_Emisora(r);
    	System.out.println("+--------------------------------------------+");
        System.out.println("|     GUARDADO CON EXITO EN EL BOTON "+r+"      |");
    	System.out.println("+--------------------------------------------+");
    			} else {
 		System.out.println("+--------------------------------------------+");
        System.out.println("|            ERROR NUMERO INVALIDO           |");
    	System.out.println("+--------------------------------------------+");
    			}
    		}

    		if (frecuencia == true){			/* si la frecuencia es true, el radio esta en FM */
    			f = "[FM]";
				emisora = carro.getEmisora();
				e = String.format("%.1f", emisora); /* consultado de http://alvinalexander.com/programming/printf-format-cheat-sheet */
    		}

    		if (frecuencia == false){			/* si la frecuencia es false, el radio esta en AM */
    			f = "[AM]";
				emisora = carro.getEmisora();
				e = String.valueOf((int)emisora);
    		}

    		
    		

    	System.out.println("+--------------------------------------------+");
        System.out.println("|                 RADIO JAVA                 |");
    	System.out.println("+--------------------------------------------+");
        System.out.println("|   "+s+"  "+f+"  ["+e+"]                       |");
        System.out.println("|                                            |");
        System.out.println("|                                            |");
        System.out.println("|  (1)(2))(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)  |");
        System.out.println("+--------------------------------------------+");
        System.out.println("");
    	System.out.println("+--------------------------------------------+");
        System.out.println("|               INSTRUCCIONES                |");
    	System.out.println("+--------------------------------------------+");
        System.out.println("| INGRESE CARACTER PARA ACCIONAR	     |");
        System.out.println("|  [o] ENCENDER/APAGAR                       |");
        System.out.println("|  [a] CAMBIAR FRECUENCIA AM/FM		     |");
        System.out.println("|  [j] CAMBIAR EMISORA <-		     |");
        System.out.println("|  [k] CAMBIAR EMISORA ->		     |");
        System.out.println("|  [g] GUARDAR EMISORA                       |");
        System.out.println("|  [s] SELECCIONAR EMISORA                   |");
        System.out.println("|  [x] SALIR                                 |");
        System.out.println("|                                            |");
    	System.out.println("+--------------------------------------------+");
        System.out.println("");

    }


    	}

    }

}
