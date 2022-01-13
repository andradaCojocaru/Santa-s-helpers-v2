package entities;

import java.util.LinkedList;

public final class Santa {
    private int numberOfYears;
    private Double budget;
    private LinkedList<Gift> giftList;
    private LinkedList<Child> childList;
    private String strategy;

    public Santa() {

    }

    public static class SantaBuilder {
        private int numberOfYears;
        private Double budget;
        private LinkedList<Gift> giftList;
        private LinkedList<Child> childList;
        private String strategy;

        public SantaBuilder(final int numberOfYears,
                            final Double budget,
                            final LinkedList<Gift> giftList,
                            final LinkedList<Child> childList,
                            final String strategy) {
            this.numberOfYears = numberOfYears;
            this.budget = budget;
            this.giftList = giftList;
            this.childList = childList;
            this.strategy = strategy;
        }

        /**
         * @return
         */
        public Santa build() {
            return new Santa(this);
        }
    }
    private Santa(final SantaBuilder santaBuilder) {
        this.numberOfYears = santaBuilder.numberOfYears;
        this.budget = santaBuilder.budget;
        this.giftList = santaBuilder.giftList;
        this.childList = santaBuilder.childList;
        this.strategy = santaBuilder.strategy;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public Double getBudget() {
        return budget;
    }

    public LinkedList<Gift> getGiftList() {
        return giftList;
    }

    public LinkedList<Child> getChildList() {
        return childList;
    }

    public void setBudget(final Double budget) {
        this.budget = budget;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(final String strategy) {
        this.strategy = strategy;
    }
}
