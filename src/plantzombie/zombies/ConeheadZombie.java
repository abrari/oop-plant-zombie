package plantzombie.zombies;

import plantzombie.plants.type.Plant;

// Ref: http://plantsvszombies.wikia.com/wiki/Conehead_Zombie

public class ConeheadZombie extends Zombie {
    
    // "topi" yang dipakai si zombie
    private String headwear = "Cone";
    
    public ConeheadZombie(int x, int y) {
        super(x, y);
        this.life = 50;
        this.attackPoint = 10;
        this.defensePoint = 5;
        System.out.println("Conehead Zombie baru pada posisi "+x+","+y);
    }
    
    // topi bisa jatuh, dan defense point jadi berkurang
    public void headwearFall() {
        this.headwear = null;
        this.defensePoint = 0;
        System.out.println("Conehead Zombie pada posisi "+x+","+y+" topinya jatuh");
    }
    
    @Override
    public void eat(Plant p) {
        super.eat(p);
        System.out.println("Conehead Zombie makan plant pada posisi "+p.getX()+","+p.getY());        
    }
    
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Conehead Zombie mati pada posisi "+x+","+y);
    }
    
}
