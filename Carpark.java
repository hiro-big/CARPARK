public class Carpark{
  public static void main(String[] args) {
    System.out.println("駐車場のスペースを入力してください");
    if(args.length != 1){
      System.out.println("入力を1つにして下さい");
      System.exit(1);
    }
    
    CarparkControl control = new CarparkControl();
    control.CarparkControl(Integer.parseInt(args[0]));
    Arrivals thread_arrive = new Arrivals();
    Departures thread_depart = new Departures();
    thread_arrive.start();
    thread_depart.start();
  }
}
