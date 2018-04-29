//Ejercicio 15. Pedir un numero por teclado y si es menor que 0 volver a pedirlo.

import java.util.Scanner;

class ejercicio15{
    public static void main(String[] args)
    {
        int numero = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero.");
            numero = sc.nextInt();
        }while(numero<0);
    }
}

//Ampliacion realizar el ejercicio con JOptionPlane.