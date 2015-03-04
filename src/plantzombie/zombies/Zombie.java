package plantzombie.zombies;

import plantzombie.GameState;
import plantzombie.plants.type.DefenderPlant;
import plantzombie.plants.type.Plant;

public abstract class Zombie {

    protected int life;
    protected int attackPoint;
    protected int defensePoint;
    protected int x;
    protected int y;
    
    public Zombie(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void eat(Plant p) {
        // jika sudah mati, jangan melakukan apa-apa
        if (this.life <= 0) return;
        
        // kurangi life dari plant sebanyak attackPoint zombie
        int plantlife = p.getLife();
        if (p instanceof DefenderPlant) {
            // khusus defender plant, hitung juga defense point-nya
            plantlife -= (this.attackPoint - ((DefenderPlant)p).getDefensePoint());
        } else {
            plantlife -= this.attackPoint;
        }
        p.setLife(plantlife);
        
        // jika life plant sudah habis, matilah sudah
        if(p.getLife() <= 0) p.destroy();
    }
    
    public void destroy() {
        this.life = 0;
        
        // tambah skor
        GameState.score += 20;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public int getDefensePoint() {
        return defensePoint;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
