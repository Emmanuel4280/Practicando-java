import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio2{

    public static void main(String[] args){


        //arreglo de los char entre comillas y el punto y coma al final

        char[] vocales = {'a','e','i','o','u'};

        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese una palabra");

        String palabra = lectura.nextLine();

        //contador fuera del bucle si no se reinicia en cada iteración

        int contador = 0;

        // declarar el tipo de variable del for

        for( int i = 0; i < palabra.length(); i ++){

            char letra = palabra.charAt(i);
//el tipo char string etc variable de donde vamos a leer y consecuencia 
            for(char v : vocales){

                if(letra == v){

                    contador++;
                }else{ }
            }

        }

        System.out.print(contador);

    }
}

