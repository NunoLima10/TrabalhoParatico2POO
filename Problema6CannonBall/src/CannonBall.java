import java.util.ArrayList;

public class CannonBall {
    private double xPosition;
    private double yPosition;

    private double xVelocity;
    private double yVelocity;

    ArrayList<Point> points = new ArrayList<>();

    public CannonBall(){
        this.xPosition = 0;
        this.yPosition = 0;

        this.xVelocity = 1;
        this.yVelocity = 1;
    }

    public  void move(double deltaSec){
        double xDistance = deltaSec * this.xVelocity;
        double yDistance = deltaSec * this.yVelocity;

        this.xPosition += xDistance;
        this.yPosition += yDistance;

        this.yVelocity += -9.8 * deltaSec;

    }
    public int [] getLocation(){
        return new int[] { (int) this.xPosition, (int) this.yPosition};
    }

    public ArrayList<Point> shoot(double alpha, double Velocity, double deltaSec){
        this.xVelocity = Velocity * Math.cos(alpha);
        this.yVelocity = Velocity * Math.sin(alpha);

        do{
            move(deltaSec);
            Point point = new Point(this.xPosition, this.yPosition);
            this.points.add(point);

        }while (this.yPosition > 0);

        return  points;
    }


}
