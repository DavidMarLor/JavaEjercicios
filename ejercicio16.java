//Escribe una aplicación con un String que contenga una contraseña cualquiera.
//Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
//Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. 
//Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

import java.util.Scanner;

class ejercicio16{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String clave = "contraseña";

        int acierta = 0;

        String clave2;
        for(int i=0; i<3;i++)
        {
            if(acierta == 0)
            {
                System.out.println("Introduce la contraseña");
                clave2 = sc.next();
                if(clave.equals(clave2)) //No se porque pero no funciona si uso == para comprobarlas debo usar equals
                {
                    System.out.println("Enhorabuena. Has acertado!!!!");
                    acierta = 1;
                }
            }
        }

        if(acierta == 0)
        {
            System.out.println("Has gastado tus tres intentos. Lo siento");
        }

    }
}