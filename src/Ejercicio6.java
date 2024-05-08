import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
       //Programa que vaya solicitando al usuario cadenas de texto y las vaya introduciendo en un
        //fichero. Se debe tener en cuenta que no se admitirán en el fichero las letras "N", "Y", y "U",
        //por lo que deberán ser eliminadas previamente.
        String rutaArchivo = "nuevo_archivo.txt";
        Scanner scanner = new Scanner(System.in);
        try {
            // Crear el objeto File
            File archivo = new File(rutaArchivo);

            // Verificar si el archivo ya existe
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            try {
                // Crear un BufferedWriter para escribir en el archivo
                BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo));

                // Pedir al usuario cadenas de texto hasta que escriba "fi"
                String entrada;
                do {
                    System.out.print("Introduce una cadena de texto (o 'salida' para terminar): ");
                    entrada = scanner.nextLine();
                    if (!entrada.equals("salida")) {
                        // Eliminar las letras "N", "Y" , "U", "n", "y" y "u" de la cadena
                        entrada = entrada.replace("N", "").replace("Y", "").replace("U", "").replace("n", "").replace("y", "").replace("u", "");

                        // Escribir la cadena modificada en el archivo si no está vacía
                        if (!entrada.isEmpty()) {
                            writer.write(entrada);
                            writer.newLine(); // Agregar una nueva línea en el archivo
                        }
                    }
                } while (!entrada.equalsIgnoreCase("salida"));

                // Cerrar el BufferedWriter y el scanner
                writer.close();
                scanner.close();

                System.out.println("Se han guardado las cadenas en el archivo correctamente.");
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }

    }
}