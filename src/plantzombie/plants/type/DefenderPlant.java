package plantzombie.plants.type;

import plantzombie.zombies.Zombie;

public abstract class DefenderPlant extends Plant {

    protected int defensePoint;

    public DefenderPlant(int x, int y, int life, int sunCost) throws Exception {
        super(x, y, life, sunCost);
    }
    
    public void defend(Zombie z) {
        // jika sudah mati, jangan melakukan apa-apa
        if (this.life <= 0) return;        
        
    }

    public int getDefensePoint() {
        return defensePoint;
    }
    
}