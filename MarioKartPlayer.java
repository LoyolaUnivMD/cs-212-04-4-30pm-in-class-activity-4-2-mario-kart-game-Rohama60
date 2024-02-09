// MarioKartPlayer.java

public class MarioKartPlayer {
    String playerName;
    String character;
    int speed;

    public MarioKartPlayer(String name, String character, int speed){
        this.playerName = name;
        this.character = character;
        this.speed = speed;
    }

    public void boost() {
        speed += 20;
    }

    public void displayInfo() {
        System.out.println("Player: " + playerName + ", Character: " + character + ", Speed: " + speed);
    }
}
