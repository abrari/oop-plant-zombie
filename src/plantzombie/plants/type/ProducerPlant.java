package plantzombie.plants.type;

import plantzombie.GameState;

public abstract class ProducerPlant extends Plant {
    
    protected int productionRate;

    public ProducerPlant(int x, int y, int life, int sunCost) throws Exception {
        // panggil konstruktor superclass
        super(x, y, life, sunCost);
    }
    
    public void produceSun() {
        // jika sudah mati, jangan melakukan apa-apa
        if (this.life <= 0) return;        
        
        // tambahkan sun sebanyak productionRate
        GameState.sun += this.productionRate;
    }

    public int getProductionRate() {
        return productionRate;
    }
    
}
