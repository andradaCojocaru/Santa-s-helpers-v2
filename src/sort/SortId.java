package sort;

import entities.Child;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SortId implements SortStrategy {
    private List<Child> children = new LinkedList<>();
    public SortId(final List<Child> children)  {
        this.children = children;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Child> implementSort() {
        List<Child> childList = new LinkedList<>();
        childList = children.stream()
                .sorted(Comparator.comparingDouble(Child::getId))
                .collect(Collectors.toList());
        return childList;
    }
}
