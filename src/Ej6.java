package ActividadesStreams.Boletin2;

import java.io.*;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        try (FileWriter fic = new FileWriter(new File("RegistroEj6.txt"))) {

            Scanner teclado = new Scanner(System.in);
            String cad = "";
            do {
                System.out.println("Introduzca cadena: ");
                cad = teclado.nextLine();

                if (!cad.equals("*"))
                    fic.write(cad.replaceAll("[NYU]", "") + "\n");

            } while (!cad.equals("*"));
        } catch (FileNotFoundException e) {
            System.out.println("Error con el fichero");
        } catch (IOException ex) {
            System.out.println("Error al manipular");
        }
    }
}
