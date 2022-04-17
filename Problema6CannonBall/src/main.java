import java.util.ArrayList;

public class main {
    public static void main(String[] args) {


        CannonBall cannonBall = new CannonBall();

        ArrayList<Point> points = cannonBall.shoot(1.5,10,0.1);

        for (int i = 0; i < points.size(); i++) {
            points.get(i).info();
            System.out.println("--------------");
        }

    }
}
