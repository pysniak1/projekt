public class Brygadzista extends Uzytkownik {
    public Brygadzista(String imie, String nazwisko, Date dataUrodzenia, String dzial, String login, String haslo) {
        super(imie, nazwisko, dataUrodzenia, dzial, login, haslo);
    }

    public List<Brygada> getBrygady() {
        return null;
    }

    public List<Zlecenie> getZlecenia() {
        return null;
    }
}
@Override
    public String toString() {
        return super.toString() + " [Brygadzista]";
    }
}