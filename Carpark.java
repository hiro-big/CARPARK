public class Carpark{
  public static void main(String[] args) {
    CarparlkControl control = new CarparkControl();
    control.CarparkControl(Integer.parseInt(args));
    Arrivals thread_arrive = new Arrivals();
    Departures thread_depart = new Departures();
    thread_arrive.start();
    thread_depart.start();
  }
}
