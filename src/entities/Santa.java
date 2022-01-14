package entities;

import java.util.List;

public final class Santa {
    private int numberOfYears;
    private Double budget;
    private List<Gift> giftList;
    private List<Child> childList;
    private String strategy;

    public Santa() {

    }

    public static class SantaBuilder {
        private int numberOfYears;
        private Double budget;
        private List<Gift> giftList;
        private List<Child> childList;
        private String strategy;

        public SantaBuilder(final int numberOfYears,
                            final Double budget,
                            final List<Gift> giftList,
                            final List<Child> childList,
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

    public List<Gift> getGiftList() {
        return giftList;
    }

    public List<Child> getChildList() {
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

    public void setChildList(final List<Child> childList) {
        this.childList = childList;
    }
}
