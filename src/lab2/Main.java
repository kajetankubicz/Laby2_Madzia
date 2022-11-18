package lab2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private ArrayList<Pracownik> pracownicy = new ArrayList<Pracownik>();

    public void dodaj_pracownika(float etat, String nazwisko, float pensja) {
    Scanner scanner1 = new Scanner(System.in);
    String nazwa = scanner1.next();
    if (nazwa.equals("Manager")) {
        pracownicy.add(
                new Manager(etat,nazwisko,pensja)
        );
    }
    else if (nazwa.equals("Tester")) {
        pracownicy.add(
                new Tester(etat,nazwisko,pensja)
        );

    }

}

    public static void main(String[] args) {

        Main main  = new Main();

        main.dodaj_pracownika(5, "Kubicz", 2000);
        main.dodaj_pracownika(5, "Karas", 2000);
        main.dodaj_pracownika(5, "Makowiecki", 2000);

        for(Pracownik pracownik: main.pracownicy) {
            System.out.println(pracownik.getNazwisko());
            System.out.println(pracownik.oblicz_pensje());
        }

        System.out.println(main.pracownicy.get(main.pracownicy.size()-1).zwolnij_pracownika(main.pracownicy));


        for(Pracownik pracownik: main.pracownicy){
            pracownik.oblicz_premie_swiateczna(main.pracownicy);
            System.out.println(pracownik.getNazwisko());
            System.out.println(pracownik.oblicz_pensje());
        }




    }


}

