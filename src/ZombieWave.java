import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public abstract class ZombieWave {
//    private String[] zombieTypes;
//    private int zombieEachLine;
//    protected AnchorPane anchorPane;


    private int waveTime;
    private int respawnSpeed;
    private int respawnZombieNumbers;
    static ArrayList<Zombie> zombies = new ArrayList<>();
    public ZombieWave(int respawnSpeed, int respawnZombieNumbers,int waveTime) {
        this.respawnSpeed = respawnSpeed;
        this.respawnZombieNumbers = respawnZombieNumbers;
        this.waveTime = waveTime;
//        anchorPane = new AnchorPane();
    }

    public int getWaveTime() {
        return waveTime;
    }

    public int getRespawnSpeed() {
        return respawnSpeed;
    }

    public int getRespawnZombieNumbers() {
        return respawnZombieNumbers;
    }


    public void setWaveTime(int waveTime) {
        this.waveTime = waveTime;
    }

    public void setRespawnSpeed(int respawnSpeed) {
        this.respawnSpeed = respawnSpeed;
    }

    public void setRespawnZombieNumbers(int respawnZombieNumbers) {
        this.respawnZombieNumbers = respawnZombieNumbers;
    }

    //    private void createWave(){
//    Thread thread = new Thread(()->{
//
//    for(int i = 0;i<(waveTime/respawnSpeed);i++){
//        if
//        Zombie zombie = new Zombie();
//    }
//    });
//
//    }
    public void createWave(){

    }
}