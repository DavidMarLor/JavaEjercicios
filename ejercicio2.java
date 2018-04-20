import javax.lang.model.util.ElementScanner6;

class ejercicio2{
    public static void main(String args[])
    {
        int variable1 = 5;
        int variable2 = 10;

        if(variable1 > variable2)
        {
            System.out.println("La variable 1 es mayor que la variable 2");
        }
        else if(variable1 < variable2)
        {
            System.out.println("La variable 2 es mayor que la variable 1");
        }
        else
        {
            System.out.println("Ambas variables son iguales.");
        }
    }
}

//Ampliado añadiendo que mire si son iguales.
//A la espera de añadir para pedir las variables por pantalla.