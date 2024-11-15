public class BusRouteStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Bus route from " + source + " to " + destination);
    }
}
