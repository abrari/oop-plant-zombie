package plantzombie.zombies;

import plantzombie.plants.type.Plant;

// Ref: http://plantsvszombies.wikia.com/wiki/Pole_Vaulting_Zombie

public class VaultingZombie extends Zombie {
    
    // apakah zombie ini sudah loncat?
    private boolean jumped = false;
    
    public VaultingZombie(int x, int y) {
        super(x, y);
        this.life = 80;
        this.attackPoint = 12;
        this.defensePoint = 0;
        System.out.println("VaultingZombie baru pada posisi "+x+","+y);
    }
    
    // Vaulting zombie bisa meloncati plant (hanya bisa sekali loncat)
    public void jump(Plant p) {
        if (this.jumped == false) {
            System.out.println("VaultingZombie meloncati plant pada posisi "+p.getX()+","+p.getY());        
            this.x--;
            this.jumped = true;
        }
    }
    
    @Override
    public void eat(Plant p) {
        super.eat(p);
        System.out.println("VaultingZombie makan plant pada posisi "+p.getX()+","+p.getY());        
    }
    
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("VaultingZombie mati pada posisi "+x+","+y);
    }
    
}
