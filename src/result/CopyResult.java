package result;

import entities.Child;
import entities.Gift;
import entities.Santa;

import java.util.LinkedList;
import java.util.List;

public class CopyResult {
    public CopyResult() {

    }

    /**
     * @param santa
     * @return
     */
    public List<ChildResult> copyConstructor(final Santa santa) {
        List<Child> children = santa.getChildList();
        List<ChildResult> newChildren = new LinkedList<>();

        for (Child child : children) {
            List<Double> niceScoreHistory = child.getNiceScoreHistory();
            List<Double> newNiceScoreHistory = new LinkedList<>();
            List<String> giftPreferences = child.getGiftsPreferences();
            List<String> newGiftPreferences = new LinkedList<>();
            List<Gift> receivedGifts = child.getReceivedGifts();
            List<GiftResult> newReceivedGifts = new LinkedList<>();
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
