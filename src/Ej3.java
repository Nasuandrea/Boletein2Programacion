package ActividadesStreams.Boletin2;

import java.io.*;

public class Ej3 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("FICHERO1.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                if (c != 32 && c != 97 && c != 101 && c != 105 && c != 111 && c != 117) {
                    System.out.print((char)c);
                }
                if (c == 10) System.out.println();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
