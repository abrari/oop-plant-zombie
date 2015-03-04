package plantzombie.plants.type;

import plantzombie.GameState;
import plantzombie.zombies.ConeheadZombie;
import plantzombie.zombies.Zombie;

public abstract class AttackerPlant extends Plant {

    protected int attackPoint;

    public AttackerPlant(int x, int y, int life, int sunCost) throws Exception {
        super(x, y, life, sunCost);
    }
    
    public void attack(Zombie z) {
        // jika sudah mati, jangan melakukan apa-apa
        if (this.life <= 0) return;        
        
        // plant hanya bisa menyerang zombie 
        // yang ada di depannya
        if(this.x < z.getX()) {
            // kurangi life dari zombie sebanyak attackPoint plant
            int zombielife = z.getLife();
            if (z instanceof ConeheadZombie) {
                // khusus conehead zombie, hitung juga defense point-nya
                zombielife -= (this.attackPoint - ((ConeheadZombie)z).getDefensePoint());
                // jika life conehead zombie tinggal separo, topinya jatuh
                if (zombielife <= z.getLife()/2) {
                    ((ConeheadZombie)z).headwearFall();
                }
            } else {
                zombielife -= this.attackPoint;
            }
            z.setLife(zombielife);

            // jika life zombie sudah habis, matilah sudah
            if(z.getLife() <= 0) z.destroy();   
            
            // tambah skor
            GameState.score += 10;
        } else {
            System.out.println("Tidak bisa menyerang zombie di belakang plant");
        }
    }

    public int getAttackPoint() {
        return attackPoint;
    }
    
}
