import java.util.Random;
public class CarparkControl  {
  private static int spaces;
  private static int capacity;

  public void CarparkControl(int n){
    Random rand = new Random();
    capacity = n;
    spaces = rand.nextInt(n+1); // 0〜n
    System.out.printf("capacity:%d,spaces:%d\n",capacity,spaces);
  }

  synchronized void arrive(){
    if(spaces > 0){
      System.out.println("a car arrives.");
      spaces--;
      System.out.printf("%d left\n",spaces);
      notifyAll();
    }
  }

  synchronized void depart(){
    if(spaces < capacity){
      System.out.println("a car departs.");
      spaces++;
      System.out.printf("%d left\n",spaces);
      notifyAll();
    }
  }
}
