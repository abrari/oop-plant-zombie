package plantzombie.plants;

import plantzombie.plants.type.AttackerPlant;
import plantzombie.zombies.Zombie;

// Ref: http://plantsvszombies.wikia.com/wiki/Peashooter

public class Peashooter extends AttackerPlant {
    
    public Peashooter(int x, int y) throws Exception {    
        super(x, y, 50, 50);
        this.attackPoint = 10;
        System.out.println("Peashooter baru pada posisi "+x+","+y);
    }
    
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Peashooter mati pada posisi "+x+","+y);
    }
    
    @Override
    public void attack(Zombie z) {
        super.attack(z);
        System.out.println("Peashooter menyerang zombie pada posisi "+z.getX()+","+z.getY());
    }
    
}
