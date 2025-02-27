package Ejercicio2;

import java.util.ArrayList;

public class Tragaperras {

    public static void main(String[] args) {

        Cartera carteraNueva = new Cartera();

        ArrayList<Dinero> newList = carteraNueva.getCarteraList();

//        newList.add(Dinero billete = new Billete(12));

        // No tengo ni idea de por qué esto no me funciona. Creía que tenía bastante claro el tema de añadir hijos pero por algún motivo me dice que
        // el acceso a la función arraylist es privada y no quiere crear el objeto. El tema de hacer arraylist de interfaz tampoco lo había visto nunca,
        // me ha venido de sopetón.

        Billete billete1 = new Billete(10);
        Billete billete2 = new Billete(15);
        Billete billete3 = new Billete(20);

        newList.add(billete1);
        newList.add(billete2);
        newList.add(billete3);

        Tarjeta tarjeta1 = new Tarjeta("1A", 23, 26);
        Tarjeta tarjeta2 = new Tarjeta("2B", 39, 67);

        newList.add(tarjeta1);
        newList.add(tarjeta2);

        System.out.println(newList);

    }

}
