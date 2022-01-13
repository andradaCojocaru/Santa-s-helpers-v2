package sort;

import entities.Child;
import enums.Cities;

import java.util.Comparator;
import java.util.LinkedList;

public class SortNiceScoreCity implements SortStrategy {
    LinkedList<Child> children = new LinkedList<>();
    public SortNiceScoreCity(final LinkedList<Child> children)  {
        this.children = children;
    }
    @Override
    public void implementSort() {
        Double average = 0.0;
        for (Cities city : Cities.values()) {
            GetNiceScoreCity getNiceScoreCity = new GetNiceScoreCity();
            average = getNiceScoreCity.getOneNiceScoreCity(children, city.name());
            PutNiceScoreCity putNiceScoreCity = new PutNiceScoreCity();
            putNiceScoreCity.putNiceScoreOneCity(children, average, city.name());
        }
        Comparator<Child> sortByNiceScoreCity = (p, o) -> Double.compare(
                p.getNiceScoreCity(), o.getNiceScoreCity());
        Comparator<Child> sortName = (p, o) -> p.getCity().compareTo(o.getCity());
        children.stream().sorted(
                sortByNiceScoreCity
                        .thenComparing(sortName));
    }
}
