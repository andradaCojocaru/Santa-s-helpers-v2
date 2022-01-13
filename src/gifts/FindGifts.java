package gifts;

import entities.Child;
import entities.Gift;
import entities.Santa;
import sort.SortId;
import sort.SortStrategy;
import sort.SortStrategyFactory;

import java.util.Comparator;
import java.util.LinkedList;
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
        for (Child child : santaBuilder.getChildList()) {
            Double leftBudget = child.getAssignedBudget();
            for (String gift : child.getGiftsPreferences()) {
                LinkedList<Gift> giftType = new LinkedList<>();
                // get the proper array
                switch (gift) {
                    case "Board Games":
                        giftType = giftsArrays.getBoardGames();
                        break;
                    case "Books":
                        giftType = giftsArrays.getBooks();
                        break;
                    case "Clothes":
                        giftType = giftsArrays.getClothes();
                        break;
                    case "Sweets":
                        giftType = giftsArrays.getSweets();
                        break;
                    case "Technology":
                        giftType = giftsArrays.getTechnology();
                        break;
                    case "Toys":
                        giftType = giftsArrays.getToys();
                        break;
                    default:
                        throw new IllegalArgumentException("Type of gift not found ");
                }
                SortStrategyFactory sortStrategyFactory = SortStrategyFactory.getInstance();
                SortStrategy sortStrategy = sortStrategyFactory.createStrategy(santaBuilder.getChildList(), santaBuilder);
                sortStrategy.implementSort();
                santaBuilder.getChildList().stream()
                        .sorted(Comparator.comparingDouble(Child::getId))
                        .collect(Collectors.toList());

                // get the cheapest gift, which is the first one if exists
                if (!giftType.isEmpty()) {
                    int i = 0;
                    Gift selectedGift = giftType.get(0);
                    while (selectedGift.getQuantity() == 0 && i < giftType.size()) {
                        selectedGift = giftType.get(i);
                    }
                    if (selectedGift.getPrice() <= leftBudget && i != giftType.size()) {
                        if (child.getReceivedGifts() == null) {
                            LinkedList<Gift> receivedGifts = new LinkedList<>();
                            child.setReceivedGifts(receivedGifts);
                        }
                        child.getReceivedGifts().add(selectedGift);
                        child.setReceivedGifts(child.getReceivedGifts());
                        leftBudget -= selectedGift.getPrice();
                    }
                }
            }
        }
    }
}
