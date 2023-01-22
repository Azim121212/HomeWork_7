public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic("save", 100) {
            @Override
            public boolean aplySuperAbility() {
                return false;
            }
        };
        System.out.println("saved: " + medic.getHealPoints());
        Magic magic= new Magic("MAGICAL DAMAGE") {
            @Override
            public String applySuperAbility() {
                return null;
            }
        };
        Warior warrior = new Warior("CRITICAL DAMAGE");


        HavingSuperAbility[] havingSuperAbilities = {medic, magic, warrior};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            superAbility(havingSuperAbilities[i]);
        }
    }

    public static void superAbility(HavingSuperAbility havingSuperAbility) {
        havingSuperAbility.aplySuperAbility();
        System.out.println(havingSuperAbility.aplySuperAbility());
    }
}