package changes;

import entities.Child;
import entities.Santa;

import java.util.List;

public class IncreaseAge {
    public IncreaseAge() {

    }

    /**
     * @param santa
     */
    public void applyIncreaseAge(final Santa santa) {
        List<Child> children = santa.getChildList();
        for (Child child : children) {
            child.setAge(child.getAge() + 1);
        }
    }
}
