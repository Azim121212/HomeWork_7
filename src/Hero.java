public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String TypeOfSuperAbility;

    public Hero() {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfSuperAbility() {
        return TypeOfSuperAbility;
    }

    public void setTypeOfSuperAbility(String typeOfSuperAbility) {
        TypeOfSuperAbility = typeOfSuperAbility;
    }

    public abstract String applySuperAbility();
}
