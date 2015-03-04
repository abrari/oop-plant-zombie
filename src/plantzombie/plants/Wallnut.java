package plantzombie.plants;

import plantzombie.plants.type.DefenderPlant;
import plantzombie.zombies.Zombie;

// Ref: http://plantsvszombies.wikia.com/wiki/Wall-nut

public class Wallnut extends DefenderPlant {
    
    public Wallnut(int x, int y) throws Exception {    
        super(x, y, 150, 50);
        this.defensePoint = 10;
        System.out.println("Wallnut baru pada posisi "+x+","+y);
    }
    
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Wallnut mati pada posisi "+x+","+y);
    }
    
    @Override
    public void defend(Zombie z) {
        super.defend(z);
        System.out.println("Wallnut menahan zombie pada posisi "+z.getX()+","+z.getY());
    }
    
}
