package gifts;

import entities.Gift;

import java.util.Comparator;
import java.util.List;

public class SortGifts {

    public SortGifts() {

    }
    private Comparator<Gift> cmp;

    /**
     *
     */
    public void sort() {
        cmp = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
    }

    /**
     * @param giftType
     */
    public void mySort(final List<Gift> giftType) {
        giftType.sort(cmp);
    }
}
