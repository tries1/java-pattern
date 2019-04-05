package decorator;

public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();
        System.out.println("----------------------------");

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();
        System.out.println("----------------------------");

        Display trafficWithLane = new TrafficDecorator(new RoadDisplay());
        trafficWithLane.draw();
        System.out.println("----------------------------");

        Display roadWithLaneAndTrafficAndCrossing =
                new TrafficDecorator(
                new LaneDecorator(
                new CrossingDecorator(
                new RoadDisplay(
                ))));
        roadWithLaneAndTrafficAndCrossing.draw();
    }
}
