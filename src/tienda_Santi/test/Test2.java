package tienda_Santi.test;

import java.awt.datatransfer.StringSelection;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

    public static void main(String[] args) {

        Set<String> stringSet = new TreeSet<>();

        String str = "";

        stringSet.add("Producto1");
        stringSet.add("Producto2");
        stringSet.add("Producto1");

      //Ciclo que imprime los elementos del TreeSet.
        for (String e : stringSet) {
            System.out.println(e + "\n");
        }


        //Ciclo que otorga los valores del TreeSet a un String
        for (String e : stringSet
        ) {
            str += e + "\n";
        }

        //Se imprime dicho String.
        System.out.println(str);


    }
}
