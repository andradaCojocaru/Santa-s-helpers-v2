package result;

import entities.Child;
import entities.Gift;
import entities.Santa;

import java.util.LinkedList;

public class CopyResult {
    public CopyResult() {

    }

    /**
     * @param santa
     * @return
     */
    public LinkedList<ChildResult> copyConstructor(final Santa santa) {
        LinkedList<Child> children = santa.getChildList();
        LinkedList<ChildResult> newChildren = new LinkedList<>();

        for (Child child : children) {
            LinkedList<Double> niceScoreHistory = child.getNiceScoreHistory();
            LinkedList<Double> newNiceScoreHistory = new LinkedList<>();
            LinkedList<String> giftPreferences = child.getGiftsPreferences();
            LinkedList<String> newGiftPreferences = new LinkedList<>();
            LinkedList<Gift> receivedGifts = child.getReceivedGifts();
            LinkedList<GiftResult> newReceivedGifts = new LinkedList<>();
            Double assignedBudget = child.getAssignedBudget();
            int age = child.getAge();
            if (receivedGifts != null) {
                for (Gift received : receivedGifts) {
                    GiftResult giftResult = new GiftResult.GiftResultBuilder(
                            received.getProductName(),
                            received.getPrice(), received.getCategory())
                            .build();
                    newReceivedGifts.add(giftResult);
                }
            }
            for (String gift : giftPreferences) {
                newGiftPreferences.add(gift);
            }

            for (Double score : niceScoreHistory) {
                newNiceScoreHistory.add(score);
            }
            ChildResult newChild = new ChildResult.ChildResultBuilder(
                    child.getId(), child.getLastName(),
                    child.getFirstName(), age, child.getCity(),
                    child.getAverageScore(), newGiftPreferences, newReceivedGifts)
                    .niceScoreHistory(newNiceScoreHistory)
                    .assignedBudget(assignedBudget)
                    .receivedGifts(newReceivedGifts)
                    .build();
            newChildren.add(newChild);
        }
        return newChildren;
    }
}
