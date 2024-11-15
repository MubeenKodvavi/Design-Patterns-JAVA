public class CarRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Car route from " + source + " to " + destination);
    }
}
