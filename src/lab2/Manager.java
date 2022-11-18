package lab2;

import java.util.ArrayList;

public class Manager extends Pracownik {
    private float dodatek;

    public Manager(float etat, String nazwisko, float pensja) {
        super(etat, nazwisko, pensja);
    }

    public float oblicz_premie_swiateczna(ArrayList<Pracownik> pracownicy){
            for(Pracownik pracownik: pracownicy){
                if(pracownik instanceof Manager){
                    dodatek += 1000.20f;
                }
                else if (pracownik instanceof Tester) {
                    dodatek += 0;
                    }
                }
            return dodatek;
    }


    @Override
    public float oblicz_pensje() {
        return (getPensja()+dodatek);
    }
}
