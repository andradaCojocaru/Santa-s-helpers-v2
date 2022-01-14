package changes;

import java.util.List;

public final class ChildrenUpdate {
    private int id;
    private Double niceScore;
    private List<String> giftPreferences;
    private String elf;

    public static class ChildrenUpdateBuilder {
        private int id;
        private Double niceScore;
        private List<String> giftPreferences;
        private String elf;

        public ChildrenUpdateBuilder(final int id, final Double niceScore,
                                     final List<String> giftPreferences,
                                     final String elf) {
            this.id = id;
            this.niceScore = niceScore;
            this.giftPreferences = giftPreferences;
            this.elf = elf;
        }

        /**
         * @return Builder
         */
        public ChildrenUpdate build() {
            return new ChildrenUpdate(this);
        }
    }
    private ChildrenUpdate(final ChildrenUpdateBuilder childrenUpdateBuilder) {
        this.id = childrenUpdateBuilder.id;
        this.niceScore = childrenUpdateBuilder.niceScore;
        this.giftPreferences = childrenUpdateBuilder.giftPreferences;
        this.elf = childrenUpdateBuilder.elf;
    }

    public int getId() {
        return id;
    }

    public Double getNiceScore() {
        return niceScore;
    }

    public List<String> getGiftPreferences() {
        return giftPreferences;
    }

    public String getElf() {
        return elf;
    }
}
