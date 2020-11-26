package app;

/**
 *
 * @author angel
 */
public abstract class Soldier {
    protected String name;
    protected int health;
    private int positionX, positionY;
    protected String status;
    
    
    public Soldier(String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    public abstract Weapon toEquip();
    
    public abstract void toApplyMechanics(Mechanics mechanics); //es mas coerente aplicar el movimiento del soldado aisladamente
                                                               // esto es usar el patron visitor
    public void to_Act(Soldier soldier){
        Weapon weapon = toEquip();  //primero equipamos al soldado
        weapon.toApply(soldier);
    }
    
    public void setPosition(int x, int y){
        this.positionX = x;
        this.positionY = y;
    }
    
    public void toAplyMoviemnt(){
        
    }
}
