package Ejercicio1;

import com.sun.jdi.request.BreakpointRequest;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GestorDeLibros {

    public static void main(String[] args) throws Exception{

        Scanner read = new Scanner(System.in);

        ArrayList<Libro> bookList = new ArrayList<>();

        int choice = 0;

        while (choice == 0){

            GestorFunciones.menu(bookList);
            choice = GestorFunciones.getMenuChoice(read);

            switch (choice){

                case 1 -> {

                    GestorFunciones.addBook(read, bookList);
                    choice = 0;

                }

                case 2 -> {

                    GestorFunciones.showBook(read, bookList);
                    choice = 0;

                }

                case 3 -> {

                    GestorFunciones.changeGenre(read, bookList);

                    choice = 0;

                }

                case 4 -> {

                    GestorFunciones.selectByAuthor(read, bookList);

                    choice = 0;

                }

                case 5 -> System.out.println("Has salido del programa.");

            }

        }

        read.close();

    }

}
