package app;

/**
 *
 * @author angel
 */
public class Swordsman extends Soldier{

    public Swordsman(String name, int health) {
        super(name,health);
    }
    
    
    @Override
    public Weapon toEquip(){
        return new Sword();
    }

    @Override
    public void toApplyMechanics(Mechanics mechanics) {

    }
}
