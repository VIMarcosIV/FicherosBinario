import org.iesch.ad.modelo.ExpresionesRegulares;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //FicheroBinario.testEscribirFicheroBinario();
        //FicheroBinario.testLeerFicheroBinario();

//        EjAleatorio.escribirEnteros();
//        EjAleatorio.leerEntero();
//        EjAleatorio.modificarEnteros();

//        File fichero = new File("FicheroBinario.iml");
//        File fichero2 = new File("Fichero.txt");
//        File directorio = new File("src");
//        File directorio2 = new File("directorio");
//
//        System.out.println("Fichero: " + fichero.exists());
//        System.out.println("Directorio: " + directorio.exists());
//        System.out.println("Fichero2: " + fichero2.exists());
//        System.out.println("Directorio2: " + directorio2.exists());
//
//        System.out.println("Es directorio: " + fichero.isDirectory());
//        System.out.println("Es directorio: " + directorio.isDirectory());
//
//        System.out.println("Fichero: " + fichero.canExecute());
//        System.out.println("Directorio: " + directorio.canExecute());
//
//        System.out.println("Fichero: " + fichero.getName());
//
//        System.out.println("Fichero: " + fichero.getAbsolutePath());
//
//        System.out.println("Fichero: " + fichero.getParent());
//        System.out.println("Directorio: " + directorio.getParent());
//
//        System.out.println("Nombre de los objetos File dentro de un Array");
//        File lista[] = directorio.listFiles();
//        for (File f : lista
//        ) {
//            System.out.println(f);
//        }
//
//        System.out.println("Creando directorio...");
//        System.out.println(directorio2.mkdir());

//        try (Stream<Path> stream = Files.list(Paths.get(System.getProperty("user.home")))) {
//
//            stream.map(String::valueOf).filter(path -> !path.startsWith("."))
//                                                            .sorted()
//                                                            .forEach(System.out::println);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        ExpresionesRegulares ex = new ExpresionesRegulares();
        ex.run();


    }
}
