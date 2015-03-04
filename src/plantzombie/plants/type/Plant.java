package plantzombie.plants.type;

import plantzombie.GameState;

public abstract class Plant {
    
    protected int life;
    protected int sunCost;  // jumlah sun untuk summon
    protected int x;    // posisi plant di arena
    protected int y;

    public Plant(int x, int y, int life, int sunCost) throws Exception {
        // jika jumlah sun tidak cukup
        if (GameState.sun < sunCost) {            
            throw new Exception("ERROR: Jumlah sun tidak cukup");
        }
        // jika sudah ada plant pada posisi tersebut...
        else if (GameState.gameTiles[x][y] == 1) {
            throw new Exception("ERROR: Sudah ada yang menempati posisi "+x+","+y);            
        } 
        // keadaan aman, lanjutkan
        else {
            this.x = x;
            this.y = y;
            this.life = life;
            this.sunCost = sunCost;
            GameState.sun -= this.sunCost;
            GameState.score += 5;
        }
    }
        
    public void destroy() {
        // bebaskan tile pada posisi x, y
        GameState.gameTiles[this.x][this.y] = 0;
        this.life = 0;
        this.x = 0;
        this.y = 0;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getSunCost() {
        return sunCost;
    }

    public void setSunCost(int sunCost) {
        this.sunCost = sunCost;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

}
