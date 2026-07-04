package StrategySteps;

import java.util.Random;

public abstract class Player {
    protected Random rand = new Random();
    protected boolean winner = false;
    protected String name;
    protected int steps;
    public static final int goalSteps = 12;
    protected static int playerCount = 0;
    protected static final int[] possibleMoves = new int[]{1,3,5};
    public Player() {
        this.name = "P" + playerCount;
        this.steps = 0;
        playerCount++;
    }
    public Player(String name) {
        this.name = name;
        this.steps = 0;
        playerCount++;
    }
    public int getSteps() {
        return steps;
    }
    public void addSteps(int steps) {
        this.steps += steps;
        if  (this.steps >= goalSteps) {
            winner = true;
        }
    }
    public String getName() {
        return name;
    }
    public boolean isWinner() {
        return winner;
    }


    public abstract int pickNumber ();


}
