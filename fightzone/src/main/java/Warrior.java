public class Warrior {
    private String name;
    private int strength;

    public Warrior(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String fight(Warrior opponent) {
        if (this.strength > opponent.strength) {
            return this.name + " wins the fight!";
        } else if (this.strength < opponent.strength) {
            return opponent.name + " wins the fight!";
        } else {
            return "It's a tie!";
        }
    }
}
