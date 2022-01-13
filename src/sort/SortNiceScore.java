package sort;

import entities.Child;

import java.util.Comparator;
import java.util.LinkedList;

public class SortNiceScore implements SortStrategy {
    private LinkedList<Child> children = new LinkedList<>();
    public SortNiceScore(final LinkedList<Child> children)  {
        this.children = children;
    }

    /**
     *
     */
    @Override
    public void implementSort() {
        Comparator<Child> sortByNiceScore = (p, o) -> Double.compare(
                p.getAverageScore(), o.getAverageScore());
        Comparator<Child> sortId = (p, o) -> Integer.compare(p.getId(), o.getId());
        children.stream().sorted(
                sortByNiceScore
                        .thenComparing(sortId));
    }
}
