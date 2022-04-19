public class Point {
    private double xPosition, yPosition;

    public Point(double xPosition, double yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public double getXPosition() {return xPosition; }

    public double getYPosition() {return yPosition; }

    public void  info(){
        System.out.println("Position x:" + this.xPosition);
        System.out.println("Position y:" + this.yPosition);
    }
}
