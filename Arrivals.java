/* 2020/11/19 Nishikawa Hiroto */
import java.lang.Thread;
import java.util.Random;
import java.io.IOException;

public class Arrivals extends Thread{
  CarparkControl control = new CarparkControl();
  int waitTime = 5;

  public void Arrivals(CarparkControl c){
    c.arrive();
  }

  public void run(){
    Random rand = new Random();
    while(true){
      Arrivals(control);

      try {
        Thread.sleep((long)(rand.nextInt(waitTime)+1)*1000); // 1〜waitTime秒でランダム待機
      } catch (InterruptedException e){
        e.printStackTrace( );
      }
    }
  }
}
