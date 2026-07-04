package StrategySteps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StrategyStepsLogic {
    private final List<Player> players = new ArrayList<>();
    private int cycle = 1;

    // Default constructor: 4 random players
    public StrategyStepsLogic() {
        for (int i = 0; i < 4; i++) {
            players.add(new RandomPlayer());
        }
    }

    // Constructor with one custom player and 3 random players
    public StrategyStepsLogic(Player humanPlayer) {
        players.add(humanPlayer);
        for (int i = 0; i < 3; i++) {
            players.add(new RandomPlayer());
        }
    }

    /**
     * Executes a single round. Collects steps, filters out duplicates,
     * moves valid players, and prints progress.
     */
    public void checkUnique() {
        Map<Integer, Integer> stepCounts = new HashMap<>();
        Map<Player, Integer> playerChoices = new HashMap<>();

        // 1. Gather all choices and count frequencies
        for (Player player : players) {
            int steps = player.pickNumber();
            playerChoices.put(player, steps);
            stepCounts.put(steps, stepCounts.getOrDefault(steps, 0) + 1);
        }

        // 2. Move players who chose a unique number
        for (Player player : players) {
            int chosenSteps = playerChoices.get(player);
            if (stepCounts.get(chosenSteps) == 1) {
                player.addSteps(chosenSteps);
                System.out.println(player.getName() + " moved " + chosenSteps + " steps.");
            }
        }

        // 3. Print round summary
        System.out.println("Round " + cycle + ":");
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getSteps());
        }
        System.out.println();

        cycle++;
    }

    public boolean checkWin() {
        for (Player player : players) {
            if (player.getSteps() >= Player.goalSteps) {
                return true;
            }
        }
        return false;
    }

    public String getWinner() {
        Player winner = null;

        if (checkWin()) {
            for (Player player : players) {
                if (player.isWinner()) {
                    // Determines the winner based on the highest score
                    if (winner == null || player.getSteps() > winner.getSteps()) {
                        winner = player;
                    }
                }
            }
        }

        String winnerName = (winner != null) ? winner.getName() : "Tie/No one";
        StringBuilder result = new StringBuilder("Winner is " + winnerName + "\n");

        for (Player player : players) {
            result.append(player.getName()).append(": ").append(player.getSteps()).append("\n");
        }

        return result.toString();
    }

    public void run() {
        while (!checkWin()) {
            checkUnique();
        }
        System.out.println(getWinner());
    }
}