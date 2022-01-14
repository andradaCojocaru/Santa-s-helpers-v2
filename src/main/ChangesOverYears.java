package main;

import changes.AnualChanges;
import changes.ChildrenUpdate;
import changes.IncreaseAge;
import changes.NewChildren;
import changes.NewChildrenUpdates;
import changes.NewGifts;
import changes.NewSantaBudget;
import entities.Santa;
import gifts.GiftsArrays;

import java.util.LinkedList;
import java.util.List;

public class ChangesOverYears {
    public ChangesOverYears() {

    }

    /**
     * @param santaBuilder
     * @param giftsArrays
     * @param anualChanges
     * @param i
     */
    public void changesImplementation(final Santa santaBuilder, final GiftsArrays giftsArrays,
                                      final List<AnualChanges> anualChanges, final int i) {
        // increase children year
        IncreaseAge increaseAge = new IncreaseAge();
        increaseAge.applyIncreaseAge(santaBuilder);
        AnualChanges change = anualChanges.get(i);
        // update santa budget
        NewSantaBudget newSantaBudget = new NewSantaBudget();
        newSantaBudget.putNewSantaBudget(santaBuilder, change.getNewSantaBudget());
        // update gifts
        NewGifts newGifts = new NewGifts();
        newGifts.putGifts(santaBuilder, change.getNewGifts(), giftsArrays);
        NewChildren newChildren = new NewChildren();
        // update children
        newChildren.addNewChildren(santaBuilder, change.getNewChildren());
        NewChildrenUpdates newChildrenUpdates = new NewChildrenUpdates();
        List<ChildrenUpdate> update = new LinkedList<>();
        update = change.getChildrenUpdate();
        newChildrenUpdates.makeNewChildrenUpdates(santaBuilder, update);
        santaBuilder.setStrategy(change.getStrategy());
    }
}
