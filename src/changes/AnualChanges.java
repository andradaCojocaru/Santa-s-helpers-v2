package changes;

import entities.Child;
import entities.Gift;

import java.util.List;

public final class AnualChanges {
    private Double newSantaBudget;
    private List<Gift> newGifts;
    private List<Child> newChildren;
    private List<ChildrenUpdate> childrenUpdate;
    private String strategy;

    public static class AnualChangesBuilder {
        private Double newSantaBudget;
        private List<Gift> newGifts;
        private List<Child> newChildren;
        private List<ChildrenUpdate> childrenUpdate;
        private String strategy;

        public AnualChangesBuilder(final Double newSantaBudget,
                                   final List<Gift> newGifts,
                                   final List<Child> newChildren,
                                   final List<ChildrenUpdate> childrenUpdate,
                                   final String strategy) {
            this.newSantaBudget = newSantaBudget;
            this.newGifts = newGifts;
            this.newChildren = newChildren;
            this.childrenUpdate = childrenUpdate;
            this.strategy = strategy;
        }

        /**
         * @return Builder
         */
        public AnualChanges build() {
            return new AnualChanges(this);
        }
    }
    private AnualChanges(final AnualChangesBuilder anualChangesBuilder) {
        this.newSantaBudget = anualChangesBuilder.newSantaBudget;
        this.newGifts = anualChangesBuilder.newGifts;
        this.newChildren = anualChangesBuilder.newChildren;
        this.childrenUpdate = anualChangesBuilder.childrenUpdate;
        this.strategy = anualChangesBuilder.strategy;
    }

    public Double getNewSantaBudget() {
        return newSantaBudget;
    }

    public List<Gift> getNewGifts() {
        return newGifts;
    }

    public List<Child> getNewChildren() {
        return newChildren;
    }

    public List<ChildrenUpdate> getChildrenUpdate() {
        return childrenUpdate;
    }

    public String getStrategy() {
        return strategy;
    }
}
