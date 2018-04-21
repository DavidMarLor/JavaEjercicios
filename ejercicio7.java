//Ejercicio 7. Pedir un numero por teclado y convertirlo a ASCII

import javax.swing.JOptionPane;

class ejercicio7{
    public static void main(String[] args)
    {
        String texto = JOptionPane.showInputDialog("Introduce un valor para convertirlo en ASCII");
        int codigo = Integer.parseInt(texto); //Convertimos un string en int.
        char character = (char)codigo; //Pasamos el entero a codigo ascii.

        System.out.println("El numero "+codigo+" equivale a "+character+" en codigo ascii");
    }
}

//Ampliacion hacerlo sin JOptionPane, solo hay que cambiarlo por Scanner.