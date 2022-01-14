package sort;

import entities.Child;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SortNiceScore implements SortStrategy {
    private List<Child> children = new LinkedList<>();
    public SortNiceScore(final List<Child> children)  {
        this.children = children;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Child> implementSort() {
        List<Child> childList = new LinkedList<>();
        Comparator<Child> sortByNiceScore = (p, o) -> Double.compare(
                o.getAverageScore(), p.getAverageScore());
        Comparator<Child> sortId = (p, o) -> Integer.compare(p.getId(), o.getId());
         childList = children.stream()
                .sorted(sortByNiceScore
                        .thenComparing(sortId))
                .collect(Collectors.toList());
         return childList;
    }

}
