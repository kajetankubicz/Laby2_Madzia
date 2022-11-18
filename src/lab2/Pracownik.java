package lab2;

import java.util.ArrayList;
import java.util.Random;

public abstract class Pracownik {
    private float etat;
    private static int liczba_pracownikow = 0;
    private String nazwisko;
    private float pensja;

    public Pracownik(float etat, String nazwisko, float pensja) {
        this.etat = etat;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }


    public String getNazwisko() {
        return nazwisko;
    }

    public float getPensja() {

        return pensja;
    }

    public abstract float oblicz_pensje();
    public abstract float oblicz_premie_swiateczna(ArrayList<Pracownik> pracownicy);

    public ArrayList<Pracownik> zwolnij_pracownika(ArrayList pracownicy){
        liczba_pracownikow = pracownicy.size();
        pracownicy.remove(pracownicy.size()-1);
        //liczba_pracownikow--;
        Random random1 = new Random();
        int value = random1.nextInt(pracownicy.size());
        System.out.println("Pracownik o indeksie: "+ value + " przejmuje obowiazki frajera");
        return pracownicy;
    }



}
