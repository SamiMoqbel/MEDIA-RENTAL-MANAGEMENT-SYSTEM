package application;
import java.util.Comparator;
public class TitleSorter implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
    }
}