package tienda.tarea;

public class TareaConsultaMetodos {


    //Cuenta la cantidad de caracteres total que conforman la cadena
    public static int contarCantidadCaracteres (String cadena){
        int cantidadCaracteres = 0;
        cantidadCaracteres = cadena.length();
        return cantidadCaracteres;
    }


    //Consigue un caracter dada la posicion [i]
    public static char conseguirCaracter (String cadena){
        char caracter;
        caracter = cadena.charAt(0);
        return caracter;
    }
    // dado un caracter, retorna la posicion de la primera aparicion de dicho caracter en la cadena
    public static int conseguirPosicionCaracter (String cadena){
        int posicionCaracter = 0;
        posicionCaracter = cadena.indexOf('a');
        return posicionCaracter;
    }
    // dado un caracter y una posicion, retorna la posicion de la primera aparicion pero contando desde la posicion dada
    public static int conseguirPosicionCaracter2 (String cadena, int posicionInicial){
        int posicionCaracter = 0;
        posicionCaracter = cadena.indexOf('a',posicionInicial);
        return posicionCaracter;
    }
    // dada una cadena, retorna partes de esa misma cadena desde la posicion inicial
    public static String subString (String cadena, int posicionInicial){
        String subString = "";
        subString = cadena.substring(posicionInicial);
        return subString;
    }
    //dada una cadena, retorna partes de la misma seg�n un rango de posiciones definido
    public static String subString2 (String cadena, int posicionInicial, int posicionFinal){
        String subString = "";
        subString = cadena.substring(posicionInicial,posicionFinal);
        return subString;
    }
    //dado una cadena y un caracter, reemplaza todas las  apariones de un caracter en la cadena por las del parametro
    public static String reemplazarCaracteres (String cadena, char caracterAntiguo, char caracterNuevo){
        String cadenaNueva = "";
        cadenaNueva = cadena.replace(caracterAntiguo, caracterNuevo);
        return cadenaNueva;
    }
    //dado una cadena y unos caracteres, reemplaza la primera aparicion de un conjunto de caracteres en la cadena por las del parametro
    public static String reemplazarConjuntoCaracteres (String cadena, String reemplazo){
        String cadenaNueva = "";
        cadenaNueva = cadena.replaceFirst(cadena, reemplazo);
        return cadenaNueva;
    }
    // dada una cadena, la convierte a un arreglo de caracteres
    public static char [] concvertirCadena (String cadena){
        char [] arregloCaracteres = cadena.toCharArray();
        return arregloCaracteres;
    }
    //Para comparar dos cadenas
    public static boolean compararCadenas (String cadena1, String cadena2){
        boolean sonIguales = false;
        if (cadena1 .equalsIgnoreCase(cadena2)){
            sonIguales = true;
        }
        return sonIguales;
    }
    //compara  cual de  dos cadenas es alfabeticamente mayor
    public  static String determinarAlfabeticamenteMayor (String cadena1,String cadena2){
        String posibilidad ="";
        if (cadena1.compareTo(cadena2)== 0){
            posibilidad ="cadena1 es igual a cadena 2";
        }
        if (cadena1.compareTo(cadena2)>0){
            posibilidad ="cadena1 es mayor alfabeticamente que cadena 2";
        }
        if (cadena1.compareTo(cadena2)<0){
            posibilidad ="cadena1 es menor alfabeticamente que cadena 2";
        }
        return posibilidad;
    }
    // convierte una cadena a mayusculas
    public static String convertirCadenaMayusculas (String cadena){
        String cadenaMayusculas = "";
        cadenaMayusculas = cadena.toUpperCase();
        return cadenaMayusculas;
    }
    // convierte una cadena a mayusculas
    public static String convertirCadenaMinusculas (String cadena){
        String cadenaMinusculas = "";
        cadenaMinusculas = cadena.toLowerCase();
        return cadenaMinusculas;
    }
    //convierte una cadena en una arreglo que contendr� partes de dicha cadena basado en un separador
    public static String[] hacerSplit (String cadena){
        String arregloCadena []= cadena.split("separador");
        return arregloCadena;
    }
    /*
     * el m�todo burbuja se encarga de ordenar los elementos en un arreglo, de forma que si
     * numero actual > numero siguiente ==> se intercambian de posicion
     */
    public static void aplicarMetodoBurbuja (int []arreglo){
        int aux = 0;
        for (int i = 0; i< arreglo.length-1; i+=1){
            for (int j=0; j< arreglo.length-1;j+=1){
                if (arreglo [j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo [j]= arreglo[j+1];
                    arreglo [j+1]= aux;
                }
            }
        }
    }
}

