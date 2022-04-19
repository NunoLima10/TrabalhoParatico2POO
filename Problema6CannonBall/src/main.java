import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        CannonBall cannonBall = new CannonBall();

        ArrayList<Point> points = cannonBall.shoot(1.5,10,0.1);

        for (Point point : points) {
            point.info();
            System.out.println("--------------");
        }

    }
}
