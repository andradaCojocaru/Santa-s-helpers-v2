package changes;

import entities.Child;
import entities.Santa;

import java.util.List;

public class NewChildren {
    public NewChildren() {

    }

    /**
     * @param santa
     * @param newChildren
     */
    public void addNewChildren(final Santa santa, final List<Child> newChildren) {
        List<Child> children = santa.getChildList();
        for (Child child : newChildren) {
            children.add(child);
        }
    }
}
