public class CarparkControl  {
  private static int spaces;
  int capacity;

  public void CarparkControl(int n){
    capacity = n;
    spaces = 0;
  }

  public int get(){
    return spaces;
  }
  public synchronized void arrive(){
    spaces--;
    System.out.printf("%d left\n",spaces);
    notifyAll();
  }

  public synchronized void depart(){
    spaces++;
    System.out.printf("%d left\n",spaces);
    notifyAll();
  }
}
