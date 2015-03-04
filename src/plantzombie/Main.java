package plantzombie;

import plantzombie.plants.Peashooter;
import plantzombie.plants.Sunflower;
import plantzombie.plants.Wallnut;
import plantzombie.zombies.RegularZombie;

public class Main {

    public static void gameSetup() {
        GameState.score = 0;
        GameState.sun = 0;
        GameState.gameTiles = new int[10][6];  // arena 5 x 9       
    }
    
    public static void main(String[] args) throws Exception {
        
        gameSetup();
        
        GameState.sunFromSky(25);
        GameState.sunFromSky(25);

        Sunflower s1 = new Sunflower(1, 1);

        GameState.sunFromSky(25);
        GameState.sunFromSky(25);            

        Sunflower s2 = new Sunflower(1, 2);

        s1.produceSun();
        s2.produceSun();
        s1.produceSun();
        s2.produceSun();

        GameState.printStatus();

        Peashooter p1 = new Peashooter(2, 1);

        GameState.printStatus();

        RegularZombie z1 = new RegularZombie(10, 1);

        p1.attack(z1);
        p1.attack(z1);

        GameState.sunFromSky(25);
        GameState.sunFromSky(25);             
        GameState.printStatus();

        Wallnut w1 = new Wallnut(5, 1);

        w1.defend(z1);
        
        z1.eat(w1);
        p1.attack(z1);
        z1.eat(w1);
        p1.attack(z1);
        z1.eat(w1);
        p1.attack(z1);

        GameState.printStatus();
    }
    
}
