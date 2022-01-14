package average;

import java.util.List;

public class BabyGetAverageStrategy implements GetAverageStrategy {
    private List<Double> historyScore;

    /**
     * @param historyScore array for averageScores
     */
    public BabyGetAverageStrategy(final List<Double> historyScore) {
        this.historyScore = historyScore;
    }

    /**
     * @return score 10 because is a baby
     */
    @Override
    public Double getAverageScore() {
        final Double ten = 10.0;
        return ten;
    }
}
