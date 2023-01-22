public class Magic extends Hero{
    public Magic(String magical_damage) {

    }

    @Override
    public boolean aplySuperAbility() {
        System.out.println("Magic применил суперспособность Ice");
        return false;
    }

    @Override
    public String applySuperAbility() {
        return null;
    }
}
