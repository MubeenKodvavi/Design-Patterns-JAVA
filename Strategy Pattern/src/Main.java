//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // client code
    public static void main(String[] args) {
        Navigator busNavigator = new Navigator(new BusRouteStrategy());
        busNavigator.buildRoute("A", "B");

        Navigator carNavigator = new Navigator(new CarRouteStrategy());
        carNavigator.buildRoute("A", "B");

        Navigator walkingNavigator = new Navigator(new WalkingRouteStrategy());
        walkingNavigator.buildRoute("A", "B");
    }
}