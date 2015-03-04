package plantzombie.plants;

import plantzombie.plants.type.ProducerPlant;

// Ref: http://plantsvszombies.wikia.com/wiki/Sun-shroom

public class Sunshroom extends ProducerPlant {
 
    public Sunshroom(int x, int y) throws Exception {    
        super(x, y, 25, 25);    // life = 25, sunCost = 25
        this.productionRate = 15;
        System.out.println("Sunshroom baru pada posisi "+x+","+y);
    }
    
    // Sunshroom bisa tumbuh jadi besar 
    // dan menghasilkan sun lebih banyak
    public void grow() {
        this.life = 50;
        this.productionRate = 25;
    }
    
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Sunshroom mati pada posisi "+x+","+y);
    }
    
    @Override
    public void produceSun() {
        super.produceSun();
        System.out.println("Sunshroom membuat "+productionRate+" sun");        
    }
    
}
