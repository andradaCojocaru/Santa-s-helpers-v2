package sort;

import entities.Child;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class SortId implements SortStrategy {
    private LinkedList<Child> children = new LinkedList<>();
    public SortId(final LinkedList<Child> children)  {
        this.children = children;
    }

    /**
     *
     */
    @Override
    public void implementSort() {
        children.stream()
                .sorted(Comparator.comparingDouble(Child::getId))
                .collect(Collectors.toList());
    }
}
