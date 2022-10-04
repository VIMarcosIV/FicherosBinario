import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.Scanner;

public class EjAleatorio {

    public static void escribirEnteros() {
        Scanner sc = new Scanner(System.in);
        RandomAccessFile fichero = null;
        int numero;

        try {
            fichero = new RandomAccessFile("enteros.dat", "rw");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Introduce un número: ");
        numero = sc.nextInt();
        try {
            fichero.seek(fichero.length());
            fichero.writeInt(numero);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fichero != null) {
                try {
                    fichero.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static void leerEntero() {
        RandomAccessFile fichero = null;
        try {
            fichero = new RandomAccessFile("enteros.dat", "r");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int numero;
        // Mostrar fichero

        try {
            fichero.seek(0);
            while (true) {
                numero = fichero.readInt();
                System.out.println(numero);
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void modificarEnteros() {
        Scanner sc = new Scanner(System.in);
        RandomAccessFile fichero = null;
        int posicion, numero;
        long size;
        try {
            fichero = new RandomAccessFile("enteros.dat", "rw");
            size = fichero.length();
            size = size / 4;
            System.out.println("El fichero tiene " + size + " enteros");

            // Modifica el entero que se encuentra en la posición
            do {
                System.out.println("Introduce la posición (>=1 y <= " + size + ")");
                posicion = sc.nextInt();
            } while (posicion < 1 || posicion > size);
            posicion--;


            // Nos situamos en la posición
            fichero.seek(posicion * 4L);

            System.out.println("El valor actuar: " + fichero.readInt());
            System.out.println("Introduce el nuevo valor");
            numero = sc.nextInt();
            fichero.seek(posicion * 4L);
            fichero.writeInt(numero);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}