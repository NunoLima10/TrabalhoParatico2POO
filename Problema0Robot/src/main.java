public class main {
    public static void main(String[] args) {

        Robot robot = new Robot(0,0,Directions.EAST);
        robot.move(3);
        robot.turnLeft();
        robot.move(3);

        double [] location = robot.getLocation();
        System.out.println(location[0]);
        System.out.println(location[1]);

        System.out.println(robot.getDirection());



    }
}
