public class VirtualPet {
  private String name;
  private int energy;
  private int happiness;
  private int weight;
  private int ageMonths;
  private int ageYears;
  private boolean agedUp;

  public VirtualPet(String name){
    this.name = name;
    this.energy = 0;
    this.happiness = 7;
    this.weight = 1;
    this.ageMonths = 0;
    this.ageYears = 0;
  }

  public String getName(){
    return name;
  }

  public int getEnergyLevel() {
    return energy;
  }
  
  public int getHappinessLevel() {
    return happiness;
  }

  public int getWeight() {
    return weight;
  }

  public int getAgeMonths() {
    return ageMonths;
  }
  
  public int getAgeYears() {
    return ageYears;
  }
  
  public boolean getAgedUp() {
    return agedUp;
  }

  public void feed(Food other) {
    if (energy <= 9) {
      energy+= other.getEnergyIncrease();
      weight += other.getWeightGain();
      happiness += other.getHappinessIncrease();
      if (happiness > 10) {
          happiness = 10;
      }
    }
  }

  public boolean play(Game other) {
    if (weight > 5){
      weight--;
    }
    if (energy >= 1) {
      energy--;
    }
    if (happiness < 10) {
      if (other.isWinner() == true) {
          happiness += other.getHappinessIncrease();
          return true;
      }
      else {
          happiness--;
          return false;
      }
    }
    return false;
  }

  public void updateStatus() {
    if (happiness > 0){
      happiness--;
    }
    if (energy > 0) {
      energy--;
    }
    ageMonths++;
    ageConverter();
  }
  
  public void setAgedUp(boolean a) {
    this.agedUp = a;
  }

  private void ageConverter() {
    if (ageMonths >= 12) {
      ageYears++;
      agedUp = true;
      ageMonths = 0;
    }
  }

  public String toString() {
    return name + "'s information:\n Energy: " + energy + "\n Happiness: " 
    + happiness + "\n Weight: " + weight + "kg" + "\n Age: " 
    + ageYears + " Years " + ageMonths + " Months";
  }
}
