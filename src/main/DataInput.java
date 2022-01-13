package main;

import average.GetAverageStrategy;
import average.GetAverageStrategyFactory;
import elves.Black;
import elves.Pink;
import entities.Child;
import entities.Santa;
import enums.ElvesType;

import java.util.LinkedList;

public class DataInput {
    public DataInput() {

    }

    /**
     * @param santaBuilder
     */
    public void setData(final Santa santaBuilder) {
        Double sumAverage = 0.0;
        Double budgetUnit = 0.0;
        Double budget = 0.0;
        final Double hundred = 100.0;
        double score = 0.0;
        final Double aboveAverage = 11.0;
        for (Child child : santaBuilder.getChildList()) {
            LinkedList<Double> niceScore = new LinkedList<>();
            niceScore.add(child.getAverageScore());
            if (child.getNiceScoreHistory() == null) {
                child.setNiceScoreHistory(niceScore);
            }
            GetAverageStrategyFactory getAverageStrategyFactory =
                    GetAverageStrategyFactory.getInstance();
            GetAverageStrategy getAverageStrategy =
                    getAverageStrategyFactory.createStrategy(child);
            child.setAverageScore(getAverageStrategy.getAverageScore());
        }

        santaBuilder.getChildList().removeIf(x -> x.getAverageScore().equals(aboveAverage));

        for (Child child : santaBuilder.getChildList()) {
            score = child.getAverageScore();
            score += score * child.getNiceScoreBonus() / hundred;
            if (score > 10) {
                score = 10;
            }
            sumAverage += score;

        }
        // calculate assignedBudget for every child
        if (sumAverage != 0.0) {
            budgetUnit = santaBuilder.getBudget() / sumAverage;
        }
        for (Child child : santaBuilder.getChildList()) {
            budget = budgetUnit * child.getAverageScore();
            if (child.getElf().equals(ElvesType.BLACK)) {
                Black black = new Black();
                budget = black.blackChanges(budget);
            } else if (child.getElf().equals(ElvesType.PINK)) {
                Pink pink = new Pink();
                budget = pink.pinkChanges(budget);
            }
            child.setAssignedBudget(budgetUnit * child.getAverageScore());
        }

    }
}
