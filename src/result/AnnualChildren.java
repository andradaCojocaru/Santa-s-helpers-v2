package result;

import java.util.List;
public final class AnnualChildren {
    private List<ChildResult> children;

    public AnnualChildren(final List<ChildResult> annualChildren) {
            this.children = annualChildren;
    }

    public List<ChildResult> getChildren() {
        return children;
    }

    public void setChildren(final List<ChildResult> annualChildren) {
        this.children = annualChildren;
    }

}
