package ActividadesStreams.Boletin2;

import java.io.*;

public class Ej5 {
    public static void main(String[] args) throws FileNotFoundException {
        // OPCION 1
        FileReader fr = new FileReader("Registro.txt");
        BufferedReader bf = new BufferedReader(fr);
        System.out.println("El fichero tiene " + bf.lines().count() + " lineas");

        // OPCION 2
//        try (FileInputStream fis =  new FileInputStream("Registro.txt")) {
//            int contLineas = 1;
//            int c;
//            while ((c = fis.read()) != -1) {
//                if (c == 10) {
//                    contLineas++;
//                }
//            }
//            System.out.println("Existen " + contLineas + " líneas en el fichero.");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
