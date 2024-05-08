package ActividadesStreams.Boletin2;

import java.io.*;

public class Ej4 {

    public static void main(String[] args) {
        try (FileReader fr =  new FileReader("FICHERO1.txt")) {
            int contador = 0;
            int c;
            while ((c = fr.read()) != -1) {
                if (c >= 65 && c <= 90) {
                    contador++;
                }
            }
            System.out.println("Existen " + contador + " letras mayúsculas en el fichero.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
