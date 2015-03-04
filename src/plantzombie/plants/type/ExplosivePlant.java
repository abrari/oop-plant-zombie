package plantzombie.plants.type;

public abstract class ExplosivePlant extends Plant {

    protected int damage;
    protected int area;

    public ExplosivePlant(int x, int y, int life, int sunCost) throws Exception {
        super(x, y, life, sunCost);
    }
    
    public void explode() {
        // jika sudah mati, jangan melakukan apa-apa
        if (this.life <= 0) return;        
        
        // todo: hancurkan seluruh zombie
        // pada area di sekitar plant ini
    }

    public int getDamage() {
        return damage;
    }

    public int getArea() {
        return area;
    }
    
}