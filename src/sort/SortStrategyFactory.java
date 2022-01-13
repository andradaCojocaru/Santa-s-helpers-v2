package sort;

import entities.Child;
import entities.Santa;
import enums.Cities;
import enums.CityStrategyEnum;

import java.util.LinkedList;

public final class SortStrategyFactory {
    private static SortStrategyFactory instance = null;
    private SortStrategyFactory() {

    }
    public static SortStrategyFactory getInstance() {
        if (instance == null) {
            instance = new SortStrategyFactory();
        }
        return instance;
    }

    public SortStrategy createStrategy(LinkedList<Child> children, Santa santa) {
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
