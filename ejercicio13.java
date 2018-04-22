//Ejercicio 13. Pedir un numero de ventas, y hacer una suma de todas las ventas.

import java.util.Scanner;

class ejercicio13{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de ventas");
        int ventas = sc.nextInt();

        int precioFinal = 0;

        for(int i=0; i<ventas;i++)
        {
            System.out.println("Introduce el precio de las ventas");
            int precio = sc.nextInt();

            precioFinal = precioFinal + precio;
        }

        System.out.println("El precio total es: "+precioFinal);
    }
}

//Ampliacion mejorar codigo y usar JOptionPane.