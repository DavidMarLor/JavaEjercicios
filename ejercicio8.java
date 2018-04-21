//Ejercicio 8. Igual que el anterior pero ahora se pide un caracter y lo convierte a codigo.

import java.util.Scanner;

class ejercicio8{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el caracter que quieres convertir");
        char caracter = sc.next();

        int codigo =  (int)caracter;

        System.out.println("El caracter introducido "+caracter+" corresponde con el codigo "+codigo);
    }
}

//la solucion esta con JOptionPane, fallo de compilacion por sc.next().