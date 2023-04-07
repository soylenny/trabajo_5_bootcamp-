package trabajo;

public class calculos {

    public static void main(String[] args) {

        // valores enteros
        byte number1 = 10; // 1 byte
        short number2 = 10; // 2 bytes
        int number3 = 10; // 4 bytes
        long number4 = 100; // 8 bytes

        System.out.println("Valores enteros: " + number1 + " , " + number2 + " , " + number3 + " , " + number4);

        // Valores con decimales
        float decimal1 = 1.1f;
        double decimal2 = 1.11d;

        System.out.println("Valores con Decimales: " + decimal1 + " , " + decimal2);

        // caracter
        char caracter = 'A';

        // cadena de texto
        String nombre = "David";
        String apellido = "Pinilla";

        System.out.println("Cadena de texto: " + nombre + " " + apellido + "\nCaracter: " + caracter);

        //Preguntas de Verdad o Falso (booleanos)
        boolean verdadero = true;
        boolean falso = false;
    }

}
