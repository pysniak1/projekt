import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Praca extends Thread {
    public enum Rodzaj { Ogolna, Montaz, Demontaz, Wymiana }

    private static Map<Integer, Praca> pracaMapa = new HashMap<>();
    private static int kolejnyNumer = 1;

    private Rodzaj rodzaj;
    private int czas;
    private boolean czyZrealizowane;
    private String opis;
    private LocalDateTime czasWykonania;

    public Praca(Rodzaj rodzaj, int czas, String opis) {
        this.rodzaj = rodzaj;
        this.czas = czas;
        this.opis = opis;
        this.czyZrealizowane = false;
        pracaMapa.put(kolejnyNumer++, this);
    }

    public static Praca pobierzPrace(int numer) {
        return pracaMapa.get(numer);
  

    @Override
    public String toString() {
        return "Praca{" +
                "rodzaj=" + rodzaj +
                ", czas=" + czas +
                ", czyZrealizowane=" + czyZrealizowane +
                ", opis='" + opis + '\'' +
                ", czasWykonania=" + czasWykonania +
                '}';
    }
}