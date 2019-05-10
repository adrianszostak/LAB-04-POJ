/**
 * @author Bartek Bizoń 20041
 * @author Adrian Szostak 19777
 *
 * It is Main class for application from 4nd lesson of JOP
 */

public class Armstrong {

    public static void main(String[] args) {

        int liczba = 153, pierwotnaLiczba, reszta, wynik = 0;

        pierwotnaLiczba = liczba;

        while (pierwotnaLiczba != 0)
        {
            reszta = pierwotnaLiczba % 10;
            wynik += Math.pow(reszta, 3);
            pierwotnaLiczba /= 10;
        }

        if(wynik == liczba)
            System.out.println(liczba + " jest liczbą Armstronga");
        else
            System.out.println(liczba + " nie jest liczbą Armstronga");
    }
}
