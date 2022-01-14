package gifts;

import entities.Gift;

import java.util.LinkedList;
import java.util.List;

public class SelectGiftType {
    public SelectGiftType() {

    }

    /**
     * @param gift
     * @param giftsArrays
     * @return
     */
    public List<Gift> getSelectGiftType(final String gift, final GiftsArrays giftsArrays) {
        List<Gift> giftType = new LinkedList<>();
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
        return giftType;
    }
}
