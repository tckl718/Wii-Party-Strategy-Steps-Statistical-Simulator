import StrategySteps.StrategyStepsLogic;

public static void main(String[] args) {
    StrategyStepsLogic strategyStepsLogic = new StrategyStepsLogic();
    for (int i = 0; i < 10 ; i ++) {
        strategyStepsLogic.run();
    }
}