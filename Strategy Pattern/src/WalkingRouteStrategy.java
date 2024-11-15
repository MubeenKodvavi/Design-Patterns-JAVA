public class WalkingRouteStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Walking route from " + source + " to " + destination);
    }
}
