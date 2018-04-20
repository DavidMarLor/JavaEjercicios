import java.util.Locale;
import java.util.Scanner;

class ejercicio5{
    public static void main(String[] args)
    {
        System.out.println("Introduce un radio");
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio,2);

        System.out.println("El area de la circunferencia con radio " + radio+ " es: "+area);
    }
}

//Ampliacion usar JOptionPane.