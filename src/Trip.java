import java.util.Comparator;

public class Trip implements Comparable <Trip>{

    public Trip(int cena, String kraj, boolean wyzywienie, int dlugosc) {
        this.cena = cena;
        this.kraj = kraj;
        this.wyzywienie = wyzywienie;
        this.dlugosc = dlugosc;
    }

    private int cena;
    private String kraj;
    private boolean wyzywienie;
    private int dlugosc;


    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public boolean isWyzywienie() {
        return wyzywienie;
    }

    public void setWyzywienie(boolean wyzywienie) {
        this.wyzywienie = wyzywienie;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }


    @Override
    public int compareTo(Trip c) {
        if (this.cena > c.cena)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "cena=" + cena +
                ", kraj='" + kraj + '\'' +
                ", wyzywienie=" + wyzywienie +
                ", dlugosc=" + dlugosc + "\n" +
                '}';
    }

}
