import java.util.Scanner;

public class Carpark{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("駐車場のスペースを入力してください");
    if(scanner.next() != 1){
      System.out.println("入力を1つにして下さい");
      System.exit(1);
    } else {
      CarparkControl control = new CarparkControl();
      control.CarparkControl(Integer.parseInt(scanner.next()));
    }
    Arrivals thread_arrive = new Arrivals();
    Departures thread_depart = new Departures();
    thread_arrive.start();
    thread_depart.start();
  }
}
