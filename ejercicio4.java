import java.util.Scanner;


public class ejercicio4{

    public static void main(String[] args){

        Scanner cadena = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto ");

        String lectura = cadena.nextLine();

        int contador_letras = 0;
        int contador_numeros = 0;

        for(int i = 0; i < lectura.length(); i++){


            char pos = lectura.charAt(i);

            if(Character.isLetter(pos)){

                contador_letras++;

            }else{

                contador_numeros++;
            }
        }

        System.out.println(contador_letras);
        System.out.println(contador_numeros);
    }
}