public class CarparkControl  {
  int spaces;
  int capacity;

  public void CarparkControl(int n){
    this.spaces = n;
  }
  public void arrive(){
    capacity--;
    System.out.printf("%d left\n",capacity);
  }

  public void depart(){
    capacity++;
    System.out.printf("%d left\n",capacity);
  }
}
