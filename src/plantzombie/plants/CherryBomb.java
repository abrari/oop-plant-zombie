package plantzombie.plants;

import plantzombie.plants.type.ExplosivePlant;

// Ref: http://plantsvszombies.wikia.com/wiki/Cherry_Bomb

public class CherryBomb extends ExplosivePlant {
    
    public CherryBomb(int x, int y) throws Exception {    
        super(x, y, 50, 150);   // life: 50, sun: 150
        this.damage = 150;
        this.area = 3;
        System.out.println("CherryBomb baru pada posisi "+x+","+y);
    }
    
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("CherryBomb mati pada posisi "+x+","+y);
    }
    
    @Override
    public void explode() {
        super.explode();
        System.out.println("CherryBomb menghancurkan zombie pada area "+area+"x"+area);
    }
    
}
