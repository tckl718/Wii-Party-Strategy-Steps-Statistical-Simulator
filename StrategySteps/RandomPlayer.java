package StrategySteps;
import java.util.Scanner;

// Player that randomly picks

public class RandomPlayer extends Player {
    public RandomPlayer(String name) {
        super(name);
    }
    public RandomPlayer() {
        super();
    }
    public int pickNumber() {
        int no = possibleMoves[rand.nextInt(3)];
        System.out.println(getName() +  " " + no);
        return no;
    }

}
