import java.io.*;

public class Teclado
{
    static private String cadena;
    static private BufferedReader in;

    // métodos públicos
	 
    public static String LeeCadena(String prompt) {
		  return  leerCadena(prompt);
    }

    public static String LeeCadena() {
        return leerCadena("");
    }

    public static int LeeEntero(String prompt) {
        return leerEntero(prompt);
    }

    public static int LeeEntero() {
        return leerEntero("");
    }

    public static double LeeDouble(String prompt) {
        return leerReal(prompt);
    }

    public static double LeeDouble() {
        return leerReal("");
    }

