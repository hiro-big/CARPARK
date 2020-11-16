public class Carpark{
  public static void main(String[] args) {
    if(args.length != 1){
      System.out.println("入力を1つにして下さい");
      System.exit(1);
    } else {
      CarparkControl control = new CarparkControl();
      control.CarparkControl(Integer.parseInt(args[0]));
      System.out.println(control.spaces);   
    }
    Arrivals thread_arrive = new Arrivals();
    Departures thread_depart = new Departures();
    thread_arrive.start();
    thread_depart.start();
  }
}
