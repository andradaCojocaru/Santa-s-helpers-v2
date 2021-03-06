package result;

import java.util.List;

public class ChildResult {
    private int id;
    private String lastName;
    private String firstName;
    private String city;
    private int age;
    private List<String> giftsPreferences;
    private Double averageScore;
    private List<Double> niceScoreHistory;
    private Double assignedBudget;
    private List<GiftResult> receivedGifts;

    public ChildResult() {

    }

    public static class ChildResultBuilder {
        private int id;
        private String lastName;
        private String firstName;
        private String city;
        private int age;
        private List<String> giftsPreferences;
        private Double averageScore;
        private List<Double> niceScoreHistory;
        private Double assignedBudget;
        private List<GiftResult> receivedGifts;

        public ChildResultBuilder(final int id, final String lastName,
                                  final String firstName, final int age,
                                  final String city,
                                  final Double averageScore,
                                  final List<String> giftsPreferences,
                                  final List<GiftResult> receivedGifts) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
            this.averageScore = averageScore;
            this.giftsPreferences = giftsPreferences;
            this.receivedGifts = receivedGifts;
        }


        /**
         * @param niceScoreHistory
         * @return
         */
        public ChildResultBuilder niceScoreHistory(final List<Double> niceScoreHistory) {
            this.niceScoreHistory = niceScoreHistory;
            return this;
        }

        /**
         * @param assignedBudget
         * @return
         */
        public ChildResultBuilder assignedBudget(final Double assignedBudget) {
            this.assignedBudget = assignedBudget;
            return this;
        }

        /**
         * @param receivedGifts
         * @return
         */
        public ChildResultBuilder receivedGifts(final List<GiftResult> receivedGifts) {
            this.receivedGifts = receivedGifts;
            return this;
        }

        /**
         * @return
         */
        public ChildResult build() {
            return new ChildResult(this);
        }
    }

    private ChildResult(final ChildResultBuilder childBuilder) {
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
    }

    /**
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * @return
     */
    public List<String> getGiftsPreferences() {
        return giftsPreferences;
    }

    /**
     * @return
     */
    public Double getAverageScore() {
        return averageScore;
    }

    /**
     * @return
     */
    public List<Double> getNiceScoreHistory() {
        return niceScoreHistory;
    }

    /**
     * @return
     */
    public Double getAssignedBudget() {
        return assignedBudget;
    }

    /**
     * @return
     */
    public List<GiftResult> getReceivedGifts() {
        return receivedGifts;
    }
}
