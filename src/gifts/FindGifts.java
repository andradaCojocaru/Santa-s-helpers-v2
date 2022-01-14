package gifts;

import entities.Child;
import entities.Gift;
import entities.Santa;
import sort.SortStrategy;
import sort.SortStrategyFactory;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FindGifts {
    public FindGifts() {

    }

    /**
     * @param santaBuilder
     * @param giftsArrays
     */
    public void findGiftsChildren(final Santa santaBuilder, final GiftsArrays giftsArrays) {
        // for every children find gifts
        SelectGiftType selectGiftType = new SelectGiftType();
        List<Gift> giftType = new LinkedList<>();
        SortStrategyFactory sortStrategyFactory = SortStrategyFactory.getInstance();
        SortStrategy sortStrategy = sortStrategyFactory.createStrategy(
                santaBuilder.getChildList(), santaBuilder);
        List<Child> children = new LinkedList<>();
        children = sortStrategy.implementSort();
        santaBuilder.setChildList(children);
        for (Child child : santaBuilder.getChildList()) {
            Double leftBudget = child.getAssignedBudget();
            for (String gift : child.getGiftsPreferences()) {
                giftType = selectGiftType.getSelectGiftType(gift, giftsArrays);

                // get the cheapest gift
                if (!giftType.isEmpty()) {
                    int i = 0;
                    Gift selectedGift = giftType.get(0);
                    while (selectedGift.getQuantity() == 0 && i < giftType.size()) {
                        i += 1;
                        if (i < giftType.size()) {
                            selectedGift = giftType.get(i);
                        }
                    }
                    if (selectedGift.getPrice() <= leftBudget && i < giftType.size()
                            && selectedGift.getQuantity() > 0) {
                        if (child.getReceivedGifts() == null) {
                            List<Gift> receivedGifts = new LinkedList<>();
                            child.setReceivedGifts(receivedGifts);
                        }
                        child.getReceivedGifts().add(selectedGift);
                        child.setReceivedGifts(child.getReceivedGifts());
                        leftBudget -= selectedGift.getPrice();
                        int newQuantity = selectedGift.getQuantity();
                        newQuantity -= 1;
                        selectedGift.setQuantity(newQuantity);
                    }
                }
            }

            if (child.getElf().equals("yellow")) {
                if (child.getReceivedGifts() == null) {
                    List<Gift> receivedGifts = new LinkedList<>();
                    child.setReceivedGifts(receivedGifts);
                    String type = child.getGiftsPreferences().get(0);
                    giftType = selectGiftType.getSelectGiftType(type, giftsArrays);
                    if (giftType.get(0).getQuantity() != 0) {
                        child.getReceivedGifts().add(giftType.get(0));
                        child.setReceivedGifts(child.getReceivedGifts());
                        int newQuantity = giftType.get(0).getQuantity();
                        newQuantity -= 1;
                        giftType.get(0).setQuantity(newQuantity);
                    }
                }
            }

        }
        children = santaBuilder.getChildList().stream()
                .sorted(Comparator.comparingDouble(Child::getId))
                .collect(Collectors.toList());
        santaBuilder.setChildList(children);
    }
}
