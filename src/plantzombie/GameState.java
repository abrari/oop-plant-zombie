package plantzombie;

public class GameState {

    // jumlah skor pemain
    public static int score;
    
    // jumlah sun
    public static int sun;
    
    // keadaan tile (arena) pada posisi x,y
    public static int[][] gameTiles;
    
    // hasilkan sun yang turun dari langit
    public static void sunFromSky(int suns) {
        GameState.sun += suns;
    }
    
    public static void printStatus() {
        // cetak skor dan sun
        System.out.println("===========");
        System.out.println("SCORE: " + GameState.score);
        System.out.println("SUN  : " + GameState.sun);
        System.out.println("===========");
    }
    
}
