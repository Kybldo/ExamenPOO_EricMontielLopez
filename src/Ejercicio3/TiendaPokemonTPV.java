package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaPokemonTPV {

    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        ArrayList<Articulo> ticket = new ArrayList<>();

        int choice = 0;

        while (choice == 0){

            TiendaFunciones.menu(ticket);

            choice = TiendaFunciones.getMenuChoice(read);

            switch (choice){

                case 1 -> {

                    TiendaFunciones.addPotion(read, ticket);

                    choice = 0;

                }

                case 2 -> {

                    TiendaFunciones.addPokeball(read, ticket);

                    choice = 0;

                }

                case 3 -> {

                    TiendaFunciones.addAcc(read, ticket);

                    choice = 0;

                }

                case 4 -> {

                    TiendaFunciones.removeItem(read, ticket);

                    choice = 0;

                }

                case 5 -> {

                    TiendaFunciones.showTicket(ticket);

                    choice = 0;

                }

                case 6 -> {

                    TiendaFunciones.calcTotal(ticket);

                    choice = 0;

                }

                case 7 -> System.out.println("Has salido del programa.");

            }

        }

        read.close();

    }

}