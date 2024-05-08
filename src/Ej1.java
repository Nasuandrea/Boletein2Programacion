package ActividadesStreams.Boletin2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ej1 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("numeros.dat");//declara fichero
        //crea flujo de salida hacia el fichero
        FileOutputStream fileout = new FileOutputStream(fichero, true);
        //crea flujo de entrada
        FileInputStream filein = new FileInputStream(fichero);
        int i;
        for (i = 1; i < 100; i++)
            fileout.write((int) Math.random() * 100); //escribe datos en el flujo de salida
        fileout.close(); //cerrar stream de salida

        int suma = 0;
        //visualizar los datos del fichero
        while ((i = filein.read()) != -1) //lee datos del flujo de entrada
            suma += i;
        System.out.println("La media es: " + suma/100);
        filein.close();  //cerrar stream de entrada
    }
}
