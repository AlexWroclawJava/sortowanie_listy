import java.util.Comparator;

class CenaComparator implements Comparator<Trip> {

    @Override
    public int compare(Trip c1, Trip c2) {
        if (c1.getCena() > c2.getCena())
            return 1;
        else if (c1.getCena() < c2.getCena())
            return -1;
        else
            return 0;
    }
}
