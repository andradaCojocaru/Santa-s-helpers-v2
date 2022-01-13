package sort;

import entities.Child;

import java.util.LinkedList;

public class PutNiceScoreCity {
    public PutNiceScoreCity() {

    }

    /**
     * @param children
     * @param average
     * @param city
     */
    public void putNiceScoreOneCity(final LinkedList<Child> children,
                                    final Double average, final String city) {
        for (Child child : children) {
            if (child.getCity().equals(city)) {
                child.setNiceScoreCity(average);
            }
        }

    }
}
