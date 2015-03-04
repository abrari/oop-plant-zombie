package plantzombie.zombies;

import plantzombie.plants.type.Plant;

// Ref: http://plantsvszombies.wikia.com/wiki/Zombie

public class RegularZombie extends Zombie {
    
    public RegularZombie(int x, int y) {
        super(x, y);
        this.life = 50;
        this.attackPoint = 10;
        this.defensePoint = 0;
        System.out.println("Zombie baru pada posisi "+x+","+y);
    }
    
    @Override
    public void eat(Plant p) {
        super.eat(p);
        System.out.println("Zombie makan plant pada posisi "+p.getX()+","+p.getY());        
    }
    
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Zombie mati pada posisi "+x+","+y);
    }
    
}
