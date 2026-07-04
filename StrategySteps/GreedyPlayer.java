package StrategySteps;

// Player who only picks 5


    public class GreedyPlayer extends Player {
        public GreedyPlayer(String name) {
            super(name);
        }
        public GreedyPlayer() {
            super();
        }
        public int pickNumber() {
            return possibleMoves[2];
        }

    }


