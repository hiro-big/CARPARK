public class Carpark{
  public static void main(String[] args) {
    CarparkControl control = new CarparkControl();
    control.CarparkControl(Integer.parseInt(args[0]));
    Arrivals thread_arrive = new Arrivals();
    Departures thread_depart = new Departures();
    thread_arrive.start();
    thread_depart.start();
  }
}
