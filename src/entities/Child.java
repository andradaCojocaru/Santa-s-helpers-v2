package entities;

import java.util.LinkedList;

public final class Child {
    private int id;
    private String lastName;
    private String firstName;
    private String city;
    private int age;
    private LinkedList<String> giftsPreferences;
    private Double averageScore;
    private LinkedList<Double> niceScoreHistory;
    private Double assignedBudget;
    private LinkedList<Gift> receivedGifts;
    private Double niceScoreBonus;
    private String elf;
    private Double niceScoreCity;

    public Child() {

    }

    public static class ChildBuilder {
        private int id;
        private String lastName;
        private String firstName;
        private String city;
        private int age;
        private LinkedList<String> giftsPreferences;
        private Double averageScore;
        private LinkedList<Double> niceScoreHistory;
        private Double assignedBudget;
        private LinkedList<Gift> receivedGifts;
        private Double niceScoreBonus;
        private String elf;
        private Double niceScoreCity;

        public ChildBuilder(final int id, final String lastName,
                            final String firstName, final int age,
                            final String city,
                            final Double averageScore,
                            final LinkedList<String> giftsPreferences,
                            final Double niceScoreBonus,
                            final String elf) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
            this.averageScore = averageScore;
            this.giftsPreferences = giftsPreferences;
            this.niceScoreBonus = niceScoreBonus;
            this.elf = elf;
        }


        /**
         * @param niceScoreHistory
         * @return
         */
        public ChildBuilder niceScoreHistory(final LinkedList<Double> niceScoreHistory) {
            this.niceScoreHistory = niceScoreHistory;
            return this;
        }

        /**
         * @param assignedBudget
         * @return
         */
        public ChildBuilder assignedBudget(final Double assignedBudget) {
            this.assignedBudget = assignedBudget;
            return this;
        }

        /**
         * @param receivedGifts
         * @return
         */
        public ChildBuilder receivedGifts(final LinkedList<Gift> receivedGifts) {
            this.receivedGifts = receivedGifts;
            return this;
        }

        /**
         * @param niceScoreCity
         * @return
         */
        public ChildBuilder niceScoreCity(final Double niceScoreCity) {
            this.niceScoreCity = niceScoreCity;
            return this;
        }

        /**
         * @return
         */
        public Child build() {
            return new Child(this);
        }
    }

    private Child(final ChildBuilder childBuilder) {
        this.id = childBuilder.id;
        this.lastName = childBuilder.lastName;
        this.firstName = childBuilder.firstName;
        this.city = childBuilder.city;
        this.age = childBuilder.age;
        this.giftsPreferences = childBuilder.giftsPreferences;
        this.averageScore = childBuilder.averageScore;
        this.niceScoreHistory = childBuilder.niceScoreHistory;
        this.assignedBudget = childBuilder.assignedBudget;
        this.receivedGifts = childBuilder.receivedGifts;
        this.niceScoreBonus = childBuilder.niceScoreBonus;
        this.elf = childBuilder.elf;
        this.niceScoreCity = childBuilder.niceScoreCity;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public LinkedList<String> getGiftsPreferences() {
        return giftsPreferences;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public LinkedList<Double> getNiceScoreHistory() {
        return niceScoreHistory;
    }

    public Double getAssignedBudget() {
        return assignedBudget;
    }

    public LinkedList<Gift> getReceivedGifts() {
        return receivedGifts;
    }

    public Double getNiceScoreBonus() {
        return niceScoreBonus;
    }

    public void setNiceScoreBonus(final Double niceScoreBonus) {
        this.niceScoreBonus = niceScoreBonus;
    }

    public void setNiceScoreHistory(final LinkedList<Double> niceScoreHistory) {
        this.niceScoreHistory = niceScoreHistory;
    }

    public void setAverageScore(final Double averageScore) {
        this.averageScore = averageScore;
    }

    public void setAssignedBudget(final Double assignedBudget) {
        this.assignedBudget = assignedBudget;
    }

    public void setReceivedGifts(final LinkedList<Gift> receivedGifts) {
        this.receivedGifts = receivedGifts;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getElf() {
        return elf;
    }

    public void setElf(final String elf) {
        this.elf = elf;
    }

    public Double getNiceScoreCity() {
        return niceScoreCity;
    }

    public void setNiceScoreCity(final Double niceScoreCity) {
        this.niceScoreCity = niceScoreCity;
    }
}
