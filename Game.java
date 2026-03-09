public class Game {
    private String name;
    private int happinessIncrease;
    private int weightLoss;

    public Game(String name, int happinessIncrease, int weightLoss) {
        this.name = name;
        this.happinessIncrease = happinessIncrease;
        this.weightLoss = weightLoss;
    }

    public String getName() {
        return name;
    }

    public int getHappinessIncrease() {
        return happinessIncrease;
    }
    
    public int getWeightLoss() {
        return weightLoss;
    }

    public boolean isWinner() {
        return Math.random() < 0.5;
    }
}
