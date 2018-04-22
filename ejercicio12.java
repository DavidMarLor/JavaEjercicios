//Ejercicio 12. Mostrar por pantalla los numeros del 1 al 100 divisibles entre 2 y 3

class ejercicio12{
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {
            if(i%2 == 0 && i%3 == 0)
            {
                System.out.println("El numero "+i+" es divisible entre 2 y 3.");
            }
        }
    }
}

//Ampliacion realizarlo con un bucle while.