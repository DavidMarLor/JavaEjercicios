//Ejercicio 6. Pedir un numero por teclado e indicar si es divisible entre 2.

import java.util.Scanner;

class ejercicio6{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        if(numero % 2 == 0)
        {
            System.out.println("El numero es divisible entre 2");
        }
        else
        {
            System.out.println("El numero no es divisible entre 2");
        }
    }
}

//Ampliacion el numero por el que se divide pedirlo por teclado.