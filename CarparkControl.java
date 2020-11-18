public class CarparkControl  {
  private static int spaces;
  private static int capacity;

  public void CarparkControl(int n){
    capacity = n;
    spaces = 4;
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
