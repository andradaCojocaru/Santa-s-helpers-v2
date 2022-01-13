package main;

import entities.Gift;
import org.json.simple.parser.ParseException;
import utils.Utils;
import common.Constants;
import changes.AnualChanges;
import entities.Child;
import entities.Santa;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class InputLoader {
    private final String inputPath;

    public InputLoader(final String inputPath) {
        this.inputPath = inputPath;
    }

    /**
     * @return
     */
    public String getInputPath() {
        return inputPath;
    }

    /**
     * @return
     */
    public Input readData() {
        JSONParser jsonParser = new JSONParser();
        LinkedList<AnualChanges> anualChanges = new LinkedList<>();
        LinkedList<Child> children = new LinkedList<>();
        LinkedList<Gift> giftList = new LinkedList<>();
        int jsonNumberOfYears = 0;
        Double jsonSantaBudget = null;

        try {
            JSONObject jsonObject = (JSONObject) jsonParser
                    .parse(new FileReader(inputPath));
            // get number of years
            jsonNumberOfYears = ((Long) jsonObject
                    .get(Constants.NUMBER_OF_YEARS)).intValue();
            // get santaBudget
            jsonSantaBudget = ((Long) jsonObject.get(Constants.SANTA_BUDGET)).doubleValue();
            JSONObject jsonInitialData = (JSONObject) jsonObject.get(Constants.INITIAL_DATA);
            JSONArray jsonChildren = (JSONArray) jsonInitialData.get(Constants.CHILDREN);
            // get children
            children = Utils.jsonNewChildren(jsonChildren);
            JSONArray jsonSantaGiftsList =
                    (JSONArray) jsonInitialData
                            .get(Constants.SANTA_GIFTS_LIST);
            giftList = Utils.jsonGifts(jsonSantaGiftsList);
            JSONArray jsonAnnualChanges = (JSONArray) jsonObject.get(Constants.ANNUAL_CHANGES);
            // get annualChanges
            anualChanges = Utils.anualChanges(jsonAnnualChanges);
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        Santa santa = new Santa.SantaBuilder(jsonNumberOfYears, jsonSantaBudget, giftList, children,
                "id")
                .build();
        return new Input(santa, anualChanges);
    }
}
