package Ejercicio1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GestorFunciones {

    public static void menu(ArrayList<Libro> bookList){

        System.out.println(" ");
        System.out.println(bookList);

        System.out.println(" ");
        System.out.println("Selecciona una opción:");
        System.out.println(" ");
        System.out.println("1. Introducir un libro a la lista");
        System.out.println("2. Mostrar información de un libro");
        System.out.println("3. Modificar el género de un libro");
        System.out.println("4. Buscar todos los libros de un autor");
        System.out.println("5. Salir");

    }

    public static int getMenuChoice(Scanner read){

        int choice = 0;

        try {

            choice = read.nextInt();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un entero.");
            read.nextLine();

        } finally {

            if (choice > 5 || choice < 1){

                System.out.println(" ");
                System.out.println("Tu entero debe estar entre el 1 y el 5.");
                choice = 0;

            }

            read.nextLine();

        }

        return choice;

    }

    public static void addBook(Scanner read, ArrayList<Libro> bookList) throws Exception{

        String isbn = "";
        String name = "";
        String author = "";
        int pageCount = 0;
        String genre = "";
        int formatChoice = 0;
        Libro.Format format = Libro.Format.HARDCOVER;

        System.out.println(" ");
        System.out.println("Introduce los datos del libro:");
        System.out.print("ISBN: ");

        try {

            isbn = read.nextLine();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un ISBN válido.");
            read.nextLine();

        }

        System.out.print("Nombre: ");

        try {

            name = read.nextLine();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un nombre válido.");
            read.nextLine();

        }

        System.out.print("Autor: ");

        try {

            author = read.nextLine();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un autor válido.");
            read.nextLine();

        }

        System.out.print("Número de páginas: ");

        try {

            pageCount = read.nextInt();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un número válido.");
            read.nextLine();

        } finally {

            if (pageCount <= 0){

                System.out.println(" ");
                System.out.println("Número de páginas inválido. Se ha establecido a 0.");
                pageCount = 0;

            }

            read.nextLine();

        }

        System.out.print("Género: ");

        try {

            genre = read.nextLine();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un género válido.");
            read.nextLine();

        }

        System.out.print("Formato: ");

        System.out.println(" ");
        System.out.println("1. Tapa Dura");
        System.out.println("2. Tapa Blanda");
        System.out.println("3. De bolsillo");

        try {

            formatChoice = read.nextInt();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un entero.");
            read.nextLine();

        } finally {

            if (formatChoice < 1 || formatChoice > 3){

                formatChoice = 1;

            }

            switch (formatChoice){

                case 1 -> format = Libro.Format.HARDCOVER;
                case 2 -> format = Libro.Format.SOFTCOVER;
                case 3 -> format = Libro.Format.POCKET;

            }

        }

        Libro book = new Libro(isbn, name, author, pageCount, genre, format);

        bookList.add(book);

    }

    public static void showBook(Scanner read, ArrayList<Libro> bookList) throws Exception{

        int selectedBook = -1;
        String isbn = "";

        System.out.println(" ");
        System.out.println("Introduce el ISBN del libro a mostrar:");

        try {

            isbn = read.nextLine();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un ISBN válido.");
            read.nextLine();

        }

        for (int i = 0; i < bookList.size(); i++){

            if (Objects.equals(bookList.get(i).getIsbn(), isbn)){

                selectedBook = i;

            } else System.out.println("No se ha encontrado ningún libro con este ISBN en la lista.");

        }

        if (selectedBook != -1){

            System.out.print(bookList.get(selectedBook));
            System.out.print(", Género: " + bookList.get(selectedBook).getGenre() + ", Páginas: " + bookList.get(selectedBook).getPageCount());

        }

    }

    public static void changeGenre(Scanner read, ArrayList<Libro> bookList) throws Exception {

        int selectedBook = -1;
        String isbn = "";
        String newGenre = "";

        System.out.println(" ");
        System.out.println("Introduce el ISBN del libro a mostrar:");

        try {

            isbn = read.nextLine();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un ISBN válido.");
            read.nextLine();

        }

        for (int i = 0; i < bookList.size(); i++){

            if (Objects.equals(bookList.get(i).getIsbn(), isbn)){

                selectedBook = i;

            } else System.out.println("No se ha encontrado ningún libro con este ISBN en la lista.");

        }

        if (selectedBook != -1){

            System.out.println(" ");
            System.out.println("Introduce el nuevo género del libro:");

            try {

                newGenre = read.nextLine();

            } catch (Exception ex){

                System.out.println(" ");
                System.out.println("Por favor, introduce un género válido.");
                newGenre = bookList.get(selectedBook).getGenre();
                read.nextLine();

            } finally {

                bookList.get(selectedBook).setGenre(newGenre);

            }

        }

    }

    public static void selectByAuthor(Scanner read, ArrayList<Libro> bookList) throws Exception {

        String author = "";
        int counter = 0;

        System.out.println(" ");
        System.out.println("Introduce el autor de los libros a mostrar:");

        try {

            author = read.nextLine();

        } catch (Exception ex){

            System.out.println(" ");
            System.out.println("Por favor, introduce un autor válido.");
            read.nextLine();

        }

        for (int i = 0; i < bookList.size(); i++){

            if (Objects.equals(bookList.get(i).getAuthor(), author)){

                System.out.print(bookList.get(i));
                System.out.print(", Género: " + bookList.get(i).getGenre() + ", Páginas: " + bookList.get(i).getPageCount());
                System.out.print("");
                counter++;

            } else if (counter == 0 ) {

                System.out.println("No se ha encontrado ningún libro con este ISBN en la lista.");

            }

        }

    }

}
