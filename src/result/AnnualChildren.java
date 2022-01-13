package result;

import java.util.LinkedList;
public final class AnnualChildren {
    private LinkedList<ChildResult> children;

    public AnnualChildren(final LinkedList<ChildResult> annualChildren) {
            this.children = annualChildren;
    }

    public LinkedList<ChildResult> getChildren() {
        return children;
    }

    public void setChildren(final LinkedList<ChildResult> annualChildren) {
        this.children = annualChildren;
    }

}
