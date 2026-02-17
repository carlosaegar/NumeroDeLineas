import java.io.File;
import java.util.Scanner;
import java.io.IOException;



public class NumeroDeLineas {
    public static void main(String[] args) {
        File archivo = new File("datos.txt");
        int contador = 0;

        try (Scanner lector = new Scanner(archivo)) {

            while (lector.hasNextLine()) {
                lector.nextLine(); // Leemos la línea actual
                contador++;        // Sumamos 1 al contador por cada línea encontrada
            }

            System.out.println("El archivo '" + archivo.getName() + "' tiene " + contador + " líneas.");

        }  catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());

        }
    }
}
