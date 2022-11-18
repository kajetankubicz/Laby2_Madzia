package lab2;

import java.util.ArrayList;

public class Tester extends Pracownik{
    public Tester(float etat, String nazwisko, float pensja) {
        super(etat, nazwisko, pensja);
    }

    @Override
    public float oblicz_pensje() {
        return getPensja();
    }

    @Override
    public float oblicz_premie_swiateczna(ArrayList<Pracownik> pracownicy) {
        return 0;
    }
}
