import java.util.Date;

public class Specjalista extends Pracownik {
    private String specjalizacja;

    public Specjalista(String imie, String nazwisko, Date dataUrodzenia, String dzial, String specjalizacja) {
        super(imie, nazwisko, dataUrodzenia, dzial);
        this.specjalizacja = specjalizacja;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    @Override
    public String toString() {
        return "Specjalista{" +
                "imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", dataUrodzenia=" + getDataUrodzenia() +
                ", dzial='" + getDzial() + '\'' +
                ", specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}