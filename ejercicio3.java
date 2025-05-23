import java.util.Scanner;


public class ejercicio3{

    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un número perro");
        int result = numero.nextInt();

        if(result % 2 == 0){

            System.out.println("es par");
        }else{

            System.out.println("Es impar");
        }
    }
}