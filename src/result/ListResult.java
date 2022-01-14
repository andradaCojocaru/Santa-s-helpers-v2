package result;

import java.util.List;

public final class ListResult {
    private List<AnnualChildren> annualChildren;

    public ListResult(final List<AnnualChildren> annualChildren) {
        this.annualChildren = annualChildren;
    }

    public List<AnnualChildren> getAnnualChildren() {
        return annualChildren;
    }

    public void setAnnualChildren(final List<AnnualChildren> annualChildren) {
        this.annualChildren = annualChildren;
    }
}
