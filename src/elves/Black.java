package elves;

public class Black  {
    public Black() {

    }

    /**
     * @param budget
     * @return
     */
    public Double blackChanges(final Double budget) {
        final Double thirty = 30.0;
        final Double hundred = 100.0;
        final Double newBudget = budget - budget * thirty / hundred;
        return newBudget;
    }

}
