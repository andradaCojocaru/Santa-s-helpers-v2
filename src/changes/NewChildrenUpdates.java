package changes;

import entities.Child;
import entities.Santa;

import java.util.LinkedList;
import java.util.List;

public class NewChildrenUpdates {
    public NewChildrenUpdates() {

    }

    /**
     * @param santa
     * @param childrenUpdates
     */
    public void makeNewChildrenUpdates(final Santa santa,
                                       final List<ChildrenUpdate> childrenUpdates) {
        for (ChildrenUpdate childrenUpdate : childrenUpdates) {
            List<Child> children = santa.getChildList();
            Child found = new Child();
            Double score = 0.0;
            final Double aboveScore = 11.0;
            int id = childrenUpdate.getId();
            List<String> giftPreferences = new LinkedList<>();
            List<String> oldPreferences = new LinkedList<>();
            String preference;
            for (Child child : children) {
                if (child.getId() == id) {
                    found = child;
                    break;
                }
            }
            String typeElf = childrenUpdate.getElf();
            found.setElf(typeElf);
            // put score in array
            score = childrenUpdate.getNiceScore();
            if (Double.compare(score, aboveScore) != 0) {
                List<Double> niceScore = found.getNiceScoreHistory();
                if (niceScore == null) {
                    niceScore = new LinkedList<>();
                }
                niceScore.add(score);
            }
            // update gift preferences
            giftPreferences = childrenUpdate.getGiftPreferences();
            oldPreferences = found.getGiftsPreferences();
            if (giftPreferences != null) {
                for (int i = giftPreferences.size() - 1; i >= 0; i--) {
                    preference = giftPreferences.get(i);
                    if (oldPreferences != null) {
                        if (oldPreferences.contains(preference)) {
                            oldPreferences.remove(preference);
                        }
                    } else {
                        oldPreferences = new LinkedList<>();
                    }
                    oldPreferences.add(0, preference);
                }
            }
        }
    }
}
