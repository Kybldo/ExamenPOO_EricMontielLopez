package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaFunciones {

    public static void menu(ArrayList<Articulo> ticket){

        System.out.println("___________________________________________________________________");

        System.out.println(" ");
        for (int i = 0; i < ticket.size(); i++){

            System.out.print((i + 1) + ". ");
            System.out.println(ticket.get(i));

        }

        System.out.println(" ");
        System.out.println("Elige una opción:");
        System.out.println(" ");
        System.out.println("1. Añadir poción al ticket");
        System.out.println("2. Añadir pokebola al ticket");
        System.out.println("3. Añadir accesorio al ticket");
        System.out.println("4. Borrar el artículo del ticket");
        System.out.println("5. Mostrar todos los artículos del ticket");
        System.out.println("6. Mostrar total");
        System.out.println("7. Salir");

    }

    public static int getMenuChoice(Scanner read) throws Exception{

        int choice = 0;

        try {

            choice = read.nextInt();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un entero.");
            read.nextLine();

        } finally {

            if (choice > 7 || choice < 1){

                System.out.println(" ");
                System.out.println("Tu entero debe estar entre el 1 y el 7.");
                choice = 0;

            }

            read.nextLine();

        }

        return choice;

    }

    public static void addPotion(Scanner read, ArrayList<Articulo> ticket) throws Exception {

        boolean free;
        int levelChoice = 0;
        int potionFree = 0;

        System.out.println(" ");
        System.out.println("Selecciona el nivel:");
        System.out.println("1, 2, 3");

        try {

            levelChoice = read.nextInt();

        } catch (Exception ex){

            System.out.println("Introduce un entero. Se establecerá a nivel 1.");
            levelChoice = 1;
            read.nextLine();

        } finally {

            if (levelChoice < 1 || levelChoice > 3) levelChoice = 1;

        }

        System.out.println(" ");
        System.out.println("¿Es gratis?");
        System.out.println("1. Sí | 2. No");

        try {

            potionFree = read.nextInt();

        } catch (Exception ex){

            System.out.println("Introduce un entero. Se establecerá a su precio normal.");
            potionFree = 2;
            read.nextLine();

        } finally {

            if (potionFree < 1 || potionFree > 2) potionFree = 1;

            if (potionFree == 1){

                free = true;

            } else free = false;

        }

        String[] efectos = {"Cura", "Revitaliza", "Energiza"};

        Pocion potion = new Pocion("Poción", free, levelChoice, efectos);

        ticket.add(potion);

    }

    public static void addPokeball(Scanner read, ArrayList<Articulo> ticket){

        Pokeball.Tipo tipo;
        boolean free;
        int ballChoice = 0;
        int ballFree = 0;

        System.out.println(" ");
        System.out.println("Selecciona el tipo:");
        System.out.println("1. Pokeball");
        System.out.println("2. Great Ball");
        System.out.println("3. Ultraball");

        try {

            ballChoice = read.nextInt();

        } catch (Exception ex){

            System.out.println("Introduce un entero. Se establecerá Pokeball.");
            ballChoice = 1;
            read.nextLine();

        } finally {

            if (ballChoice < 1 || ballChoice > 3) ballChoice = 1;

            if (ballChoice == 1){

                tipo = Pokeball.Tipo.POKEBALL;

            } else if (ballChoice == 2) {

                tipo = Pokeball.Tipo.GREAT_BALL;

            } else tipo = Pokeball.Tipo.ULTRA_BALL;

        }

        System.out.println(" ");
        System.out.println("¿Es gratis?");
        System.out.println("1. Sí | 2. No");

        try {

            ballFree = read.nextInt();

        } catch (Exception ex){

            System.out.println("Introduce un entero. Se establecerá a su precio normal.");
            ballFree = 2;
            read.nextLine();

        } finally {

            if (ballFree < 1 || ballFree > 2) ballFree = 1;

            if (ballFree == 1){

                free = true;

            } else free = false;

        }

        Pokeball ball = new Pokeball("Pokeball", free, tipo);

        ticket.add(ball);

    }

    public static void addAcc(Scanner read, ArrayList<Articulo> ticket){

        boolean free;
        int accFree = 0;

        System.out.println(" ");
        System.out.println("Introduce el nombre del accesorio:");

        String accName = read.nextLine();

        System.out.println(" ");
        System.out.println("¿Es gratis?");
        System.out.println("1. Sí | 2. No");

        try {

            accFree = read.nextInt();

        } catch (Exception ex){

            System.out.println("Introduce un entero. Se establecerá a su precio normal.");
            accFree = 2;
            read.nextLine();

        } finally {

            if (accFree < 1 || accFree > 2) accFree = 1;

            if (accFree == 1){

                free = true;

            } else free = false;

        }

        Accesorio acc = new Accesorio("Accesorio", free, accName);

        ticket.add(acc);

    }

    public static void removeItem(Scanner read, ArrayList<Articulo> ticket){

        int pos = 0;

        System.out.println("Introduce la posición del artículo a eliminar:");

        try {

            pos = read.nextInt();

        } catch (Exception ex){

            System.out.println("Introduce un entero. Se establecerá la posición 1.");
            pos = 1;
            read.nextLine();

        } finally {

            pos--;

            if (pos > ticket.size()){

                System.out.println(" ");
                System.out.println("Posición inválida.");

            } else {

                ticket.remove(pos);

            }

        }
    }

    public static void showTicket(ArrayList<Articulo> ticket){

        for (Articulo articulo : ticket) {

            System.out.println(articulo);

        }

    }

    public static void calcTotal(ArrayList<Articulo> ticket){

        int finalPrice = 0;

        for (Articulo articulo : ticket) {

            finalPrice += articulo.returnPrice();

        }

        System.out.println("El total de tu ticket es: " + finalPrice);

    }

}
