package elves;

public class Pink {
    public Pink() {

    }

    /**
     * @param budget
     * @return
     */
    public Double pinkChanges(final Double budget) {
        final Double thirty = 30.0;
        final Double hundred = 100.0;
        final Double newBudget = budget + budget * thirty / hundred;
        return newBudget;
    }

}
