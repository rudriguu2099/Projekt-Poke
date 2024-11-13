public class Pokemon {
    private int life;
    private Type type;
    private Rarity rarity;
    private int power;
    private double critiChance;

    public Pokemon(int life, Type type, Rarity rarity, int power, double critiChance) {
        this.life = life;
        this.type = type;
        this.rarity = rarity;

        if(this.rarity == Rarity.LEGENDARY) power += 4;
        if(this.rarity == Rarity.COMMON) power += 1;
        if(this.rarity == Rarity.RARE) power += 2;

        this.power = power;
        this.critiChance = critiChance;
    }

    public int attack(Pokemon pokemon) {
        int dmg = this.power * ((1 + (Rand.boolToInt(Rand.next(this.critiChance)))));
        pokemon.setLife(getLife() - dmg);
        return dmg;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return this.life;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Pokemon Info ===\n");
        sb.append("Type: ").append(type.name()).append("\n");
        sb.append("Rarity: ").append(rarity.name()).append("\n");
        sb.append("Life: ").append(life).append(" HP\n");
        sb.append("Power: ").append(power).append(" points\n");
        sb.append("Critical Chance: ").append(String.format("%.2f", critiChance)).append("%\n");
        sb.append("====================");

        return sb.toString();
    }
}

