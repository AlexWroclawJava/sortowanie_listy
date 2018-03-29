import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Trip> lista = new ArrayList<>();

        lista.add(new Trip(1999, "Bułgaria", true, 14));
        lista.add(new Trip(2999, "USA", true, 7));
        lista.add(new Trip(999, "Grecja", true, 10));
        lista.add(new Trip(3999, "Japonia", false, 20));

        Collections.sort(lista, Trip::compareTo);
        System.out.println(lista);

    }
}

