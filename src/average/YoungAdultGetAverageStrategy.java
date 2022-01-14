package average;

import java.util.List;

public class YoungAdultGetAverageStrategy implements GetAverageStrategy {
    private List<Double> historyScore;
    public YoungAdultGetAverageStrategy(final List<Double> historyScore) {
        this.historyScore = historyScore;
    }

    /**
     * @return aboveAverage 11, a score that is impossible to obtain, to delete the child later
     */
    @Override
    public Double getAverageScore() {
        final Double aboveAverage = 11.0;
        return aboveAverage;
    }
}
