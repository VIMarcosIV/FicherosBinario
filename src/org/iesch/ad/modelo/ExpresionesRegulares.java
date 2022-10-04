package org.iesch.ad.modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
    public void run() {
        patronExacto("abc");
        contieneCadena("wabcrt");
        empiezaPorCadena("abcrerere");
        empiezaPorCadena2("Abcrerere");
        cadenaConLongitud("abcfrtya");
        soloTieneAoB("aababababababababababab");
        cadenaSoloTiene1yNoSeguidoDe2("1111111323434534634523423");
        cadenaSoloTiene1yNoSeguidoDe2("12121212121212");
    }

    private void cadenaSoloTiene1yNoSeguidoDe2(String cadena) {
        Pattern pat = Pattern.compile(".*1(?!2).*");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

    private void soloTieneAoB(String cadena) {
        Pattern pat = Pattern.compile("(a|b)+");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

    private void cadenaConLongitud(String cadena) {
        Pattern pat = Pattern.compile("[a-zA]{5,10}");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

    private void empiezaPorCadena2(String cadena) {
        Pattern pat = Pattern.compile("^[aA]bc.*");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

    private void empiezaPorCadena(String cadena) {
        Pattern pat = Pattern.compile("^abc.*");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

    private void contieneCadena(String cadena) {
        Pattern pat = Pattern.compile(".*abc.*");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

    private void patronExacto(String cadena) {
        Pattern pat = Pattern.compile("abc");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}
