package average;

import java.util.List;

public class TeenGetAverageStrategy implements GetAverageStrategy {
    private List<Double> historyScore;
    public TeenGetAverageStrategy(final List<Double> historyScore) {
        this.historyScore = historyScore;
    }

    /**
     * @return weighted average
     */
    @Override
    public Double getAverageScore() {
        Double sum = 0.0;
        Double nr = 0.0;
        Double i = 1.0;
        for (Double score : historyScore) {
            sum += score * i;
            i += 1;
        }
        nr = ((i - 1) * i) / 2;
        return sum / nr;
    }
}
