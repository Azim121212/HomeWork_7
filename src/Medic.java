public class Medic extends Hero{
    private int healPoints;

    public Medic(String attackType, int healPoints) {
        super();
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public String

    applySuperAbility(){
        return "Medic use " + "SuperAbility " + getAttackType() +
                "\nsaved: " + (int) increaseExperience();
    }

    private String getAttackType() {
        return null;
    }


    public double increaseExperience(){
        return getHealPoints() + (getHealPoints() * 10 / 100);
    }

    @Override
    public boolean aplySuperAbility() {
        return false;
    }
}