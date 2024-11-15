public class Navigator {
    // Context code
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(String source, String destination) {
        routeStrategy.buildRoute(source, destination);
    }
}
