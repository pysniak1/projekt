import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pracownik implements Comparable<Pracownik> {
    private static List<Pracownik> listaPracownikow = new ArrayList<>();
    protected String imie;
    protected String nazwisko;
    protected Date dataUrodzenia;
    protected String dzial;

    public Pracownik(String imie, String nazwisko, Date dataUrodzenia, String dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.dzial = dzial;
        listaPracownikow.add(this);
    }

    public static List<Pracownik> getListaPracownikow() {
        return listaPracownikow;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getDzial() {
        return dzial;
    }

    @Override
    public int compareTo(Pracownik innyPracownik) {
        int porownanieNazwisk = this.nazwisko.compareTo(innyPracownik.nazwisko);
        if (porownanieNazwisk != 0) {
            return porownanieNazwisk;
        }
        return this.imie.compareTo(innyPracownik.imie);
    }
}
