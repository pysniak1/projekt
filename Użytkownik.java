import java.util.Date;

public class Uzytkownik extends Pracownik {
    private String login;
    private String haslo;
    private String inicial;

    public Użytkownik(String imie, String nazwisko, Date dataUrodzenia, String dzial, String login, String haslo) {
        super(imie, nazwisko, dataUrodzenia, dzial);
        this.login = login;
        this.haslo = haslo;
        this.inicial = generateInicial(imie, nazwisko);
    }

    private String generateInicial(String imie, String nazwisko) {
        return (imie.substring(0, 1) + nazwisko.substring(0, 1)).toUpperCase();
    }

    public String getLogin() {
        return login;
    }

    public String getHaslo() {
        return haslo;
    }

    public String getInicial() {
        return inicial;
    }

    public void setImie(String imie) {
        this.imie = imie;
        this.inicial = generateInicial(imie, nazwisko);
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        this.inicial = generateInicial(imie, nazwisko);
    }

    @Override
    public String toString() {
        return "Uzytkownik{" +
                "imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", dataUrodzenia=" + getDataUrodzenia() +
                ", dzial='" + getDzial() + '\'' +
                ", login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                ", inicial='" + inicial + '\'' +
                '}';
    }
}
