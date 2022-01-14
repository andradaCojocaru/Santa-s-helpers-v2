package sort;

import entities.Child;
import enums.Cities;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNiceScoreCity implements SortStrategy {
    private List<Child> children;
    public SortNiceScoreCity(final List<Child> children)  {
        this.children = children;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Child> implementSort() {
        List<Child> childList;
        Double average = 0.0;
        for (Cities city : Cities.values()) {
            GetNiceScoreCity getNiceScoreCity = new GetNiceScoreCity();
            average = getNiceScoreCity.getOneNiceScoreCity(children, city.getValue());
            PutNiceScoreCity putNiceScoreCity = new PutNiceScoreCity();
            putNiceScoreCity.putNiceScoreOneCity(children, average, city.getValue());
        }
        Comparator<Child> sortByNiceScoreCity = (p, o) -> Double.compare(
                o.getNiceScoreCity(), p.getNiceScoreCity());
        Comparator<Child> sortName = (p, o) -> p.getCity().compareTo(o.getCity());
        childList = children.stream()
                .sorted(sortByNiceScoreCity
                        .thenComparing(sortName))
                .collect(Collectors.toList());
        return childList;
    }
}
