package average;

import java.util.List;

public class KidGetAverageStrategy implements GetAverageStrategy {
    private List<Double> historyScore;
    public KidGetAverageStrategy(final List<Double> historyScore) {
        this.historyScore = historyScore;
    }

    /**
     * @return arithmetic average
     */
    @Override
    public Double getAverageScore() {
        Double sum = 0.0;
        Double nr = 0.0;
        for (Double score : historyScore) {
            sum += score;
            nr += 1;
        }
        return sum / nr;
    }
}
