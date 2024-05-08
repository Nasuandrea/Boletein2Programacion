package ActividadesStreams.Boletin2;

import java.io.*;

public class Ej2 {
    public static void main(String[] args) {
        File temp;
        DataInputStream fichero1Leer, fichero2Leer, ficheroTemporalLeer;
        DataOutputStream fichero1Escribir, fichero2Escribir, ficheroTemporalEscribir;

        try {
            temp = File.createTempFile("temp", ".txt");

            fichero1Leer = new DataInputStream(new FileInputStream("FICHERO1.txt"));
            ficheroTemporalEscribir = new DataOutputStream(new FileOutputStream(temp));

            while (fichero1Leer.available() != 0) {
                ficheroTemporalEscribir.write(fichero1Leer.read());
            }

            fichero1Leer.close();
            ficheroTemporalEscribir.close();

            fichero2Leer = new DataInputStream(new FileInputStream("FICHERO2.txt"));
            fichero1Escribir = new DataOutputStream(new FileOutputStream("FICHERO1.txt"));

            while (fichero2Leer.available() != 0) {
                fichero1Escribir.write(fichero2Leer.read());
            }

            fichero2Leer.close();
            fichero1Escribir.close();

            ficheroTemporalLeer = new DataInputStream(new FileInputStream(temp));
            fichero2Escribir = new DataOutputStream(new FileOutputStream("FICHERO2.txt"));

            while (ficheroTemporalLeer.available() != 0) {
                fichero2Escribir.write(ficheroTemporalLeer.read());
            }

            ficheroTemporalLeer.close();
            fichero2Escribir.close();

            System.out.println((temp.delete() ? "Temporal eliminado con exito" : "No se pudo eliminar el temporal"));
        } catch (FileNotFoundException ex) {
            System.out.println("Error al encontrar el fichero");
        } catch (IOException ex) {
            System.out.println("Error al manipular el archivo");
        }

    }
}
