package gifts;

import entities.Gift;
import entities.Santa;

import java.util.LinkedList;
import java.util.List;

public class SetGifts {
    public SetGifts() {
    }

    /**
     * @param santaBuilder
     * @return
     */
    public GiftsArrays setGiftsInArray(final Santa santaBuilder) {
        GiftPutInCategories giftPutInCategories =
                new GiftPutInCategories(santaBuilder.getGiftList());
        List<Gift> boardGames = new LinkedList<>();
        List<Gift> books = new LinkedList<>();
        List<Gift> clothes = new LinkedList<>();
        List<Gift> sweets = new LinkedList<>();
        List<Gift> technology = new LinkedList<>();
        List<Gift> toys = new LinkedList<>();
        GiftsArrays giftsArrays =
                new GiftsArrays(boardGames, books, clothes, sweets, technology, toys);
        giftPutInCategories.giftSortType(giftsArrays);
        // sort after price every array
        SortGifts sortGifts = new SortGifts();
        sortGifts.sort();
        sortGifts.mySort(boardGames);
        sortGifts.mySort(books);
        sortGifts.mySort(clothes);
        sortGifts.mySort(sweets);
        sortGifts.mySort(technology);
        sortGifts.mySort(toys);
        return giftsArrays;
    }
}
