package plantzombie.plants;

import plantzombie.plants.type.ProducerPlant;

// Ref: http://plantsvszombies.wikia.com/wiki/Sunflower

public class Sunflower extends ProducerPlant {
 
    public Sunflower(int x, int y) throws Exception {    
        super(x, y, 50, 50);    // life = 50, sunCost = 50
        this.productionRate = 25;
        System.out.println("Sunflower baru pada posisi "+x+","+y);
    }
    
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Sunflower mati pada posisi "+x+","+y);
    }
    
    @Override
    public void produceSun() {
        super.produceSun();
        System.out.println("Sunflower membuat "+productionRate+" sun");        
    }
    
}
