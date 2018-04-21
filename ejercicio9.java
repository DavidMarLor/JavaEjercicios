//Ejercicio 9. Calcular el precio de un producto que pedimos por teclado.
import java.util.Scanner;

class ejercicio9{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio de un producto para calcularle el iva");
        double precio = sc.nextDouble();

        double precioFinal = precio + (precio * 21) / 100;

        System.out.println("El precio final del producto es: "+precioFinal);
    }
}

//Realizarlo con JOption para ir acostumbrandose a las ventanas emergentes.