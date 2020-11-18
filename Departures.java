import java.lang.Thread;
import java.util.Random;
import java.io.IOException;

public class Departures extends Thread{
  CarparkControl control = new CarparkControl();
  int waitTime = 5;

  public void Departures(CarparkControl c){
    c.depart();
  }

  public void run(){
    Random rand = new Random();
    while(true){
      Departures(control);

      try {
        Thread.sleep((long)(rand.nextInt(waitTime)+1)*1000); // 1〜waitTime秒でランダム待機
      } catch (InterruptedException e){
        e.printStackTrace( );
      }
    }
  }
}
