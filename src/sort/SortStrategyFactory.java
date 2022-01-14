package sort;

import entities.Child;
import entities.Santa;

import java.util.List;

public final class SortStrategyFactory {
    private static SortStrategyFactory instance = null;
    private SortStrategyFactory() {

    }

    /**
     * @return
     */
    public static SortStrategyFactory getInstance() {
        if (instance == null) {
            instance = new SortStrategyFactory();
        }
        return instance;
    }

    /**
     * @param children
     * @param santa
     * @return
     */
    public SortStrategy createStrategy(final List<Child> children, final Santa santa) {
        switch (santa.getStrategy()) {
            case "id": return
                    new SortId(children);
            case "niceScoreCity": return
                    new SortNiceScoreCity(children);
            case "niceScore": return
                    new SortNiceScore(children);
            default:
                throw new IllegalArgumentException("Strategy not found ");
        }
    }
}
