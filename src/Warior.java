public class Warior extends Hero{
    public Warior(String critical_damage) {
        super();

    }

    @Override
    public boolean aplySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
        return false;
    }

    @Override
    public String applySuperAbility() {
        return null;
    }
}
