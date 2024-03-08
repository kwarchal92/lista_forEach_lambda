package forEach;

import java.util.*;
import java.util.Collection;

public class Main {
    public static void main(String[] args)
    {
        ArrayList lista = new ArrayList(); //utworzenie obiektu klasu ArrayList().

        lista.add(10);
        lista.add(24);
        lista.add(160);
        lista.add(-10);
        lista.add(14);
        lista.add(-184);

        System.out.println("Elementy nieposortowane.");

        lista.forEach(e -> System.out.print(e + ", ")); //wyrażenie lambda

        System.out.println();
        Collections.sort(lista); //sortowanie listy

        System.out.println("Elementy posortowane.");

        lista.forEach(e -> System.out.print(e + ", ")); //wyrażenie lambda

        System.out.println();
        lista.remove(1); //usunięto drugi element listy
        System.out.println("Usunięto drugi element z listy i dodano nowy.");

        lista.add(11); //dodano nowy element do listy
        System.out.println("Elementy nieposortowane po usunięcu elementu i dodaniu nowego");


        lista.forEach(e -> System.out.print(e + ", ")); //wyrażenie lambda

        Collections.sort(lista); //ponowne sortowanie listy
        
        System.out.println();
        System.out.println("Ponowne sortowanie listy.");

        lista.forEach(e -> System.out.print(e + ", ")); //wyrażenie lambda
    }
}
