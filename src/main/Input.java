package main;

import changes.AnualChanges;
import entities.Santa;

import java.util.List;


public class Input {
    private Santa santa;
    private List<AnualChanges> anualChanges;

    public Input(final Santa santa,
                 final List<AnualChanges> anualChanges) {
        this.santa = santa;
        this.anualChanges = anualChanges;
    }

    /**
     * @return
     */
    public Santa getSanta() {
        return santa;
    }

    /**
     * @return
     */
    public List<AnualChanges> getAnualChanges() {
        return anualChanges;
    }
}
