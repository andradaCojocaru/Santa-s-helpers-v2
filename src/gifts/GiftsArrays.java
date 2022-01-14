package gifts;

import entities.Gift;

import java.util.List;

public class GiftsArrays {
    private List<Gift> boardGames;
    private List<Gift> books;
    private List<Gift> clothes;
    private List<Gift> sweets;
    private List<Gift> technology;
    private List<Gift> toys;

    public GiftsArrays(final List<Gift> boardGames,
                       final List<Gift> books,
                       final List<Gift> clothes,
                       final List<Gift> sweets,
                       final List<Gift> technology,
                       final List<Gift> toys) {
        this.boardGames = boardGames;
        this.books = books;
        this.clothes = clothes;
        this.sweets = sweets;
        this.technology = technology;
        this.toys = toys;
    }

    /**
     * @return
     */
    public List<Gift> getBoardGames() {
        return boardGames;
    }

    /**
     * @return
     */
    public List<Gift> getBooks() {
        return books;
    }

    /**
     * @return
     */
    public List<Gift> getClothes() {
        return clothes;
    }

    /**
     * @return
     */
    public List<Gift> getSweets() {
        return sweets;
    }

    /**
     * @return
     */
    public List<Gift> getTechnology() {
        return technology;
    }

    /**
     * @return
     */
    public List<Gift> getToys() {
        return toys;
    }

    /**
     * @param boardGames
     */
    public void setBoardGames(final List<Gift> boardGames) {
        this.boardGames = boardGames;
    }

    /**
     * @param books
     */
    public void setBooks(final List<Gift> books) {
        this.books = books;
    }

    /**
     * @param clothes
     */
    public void setClothes(final List<Gift> clothes) {
        this.clothes = clothes;
    }

    /**
     * @param sweets
     */
    public void setSweets(final List<Gift> sweets) {
        this.sweets = sweets;
    }

    /**
     * @param technology
     */
    public void setTechnology(final List<Gift> technology) {
        this.technology = technology;
    }

    /**
     * @param toys
     */
    public void setToys(final List<Gift> toys) {
        this.toys = toys;
    }
}
