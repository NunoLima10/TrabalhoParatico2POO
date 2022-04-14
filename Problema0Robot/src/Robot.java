enum Directions {
    NORTH, EAST, SOUTH, WEST;

    public  static Directions getDirectionByOrdinal(int directionIndex) {
        if (directionIndex < 0) directionIndex = 3;
        if (directionIndex > 3) directionIndex = 0;

        return Directions.values()[directionIndex];
    }
}

public class Robot {
    private double xPosition, yPosition;
    private Directions direction;

    public Robot(double xPosition, double yPosition, Directions direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public void turnLeft() {
        int directionIndex = this.direction.ordinal();
        int newDirectionIndex = directionIndex - 1;
        this.direction = Directions.getDirectionByOrdinal(newDirectionIndex);
    }

    public void turnRight() {
        int directionIndex = this.direction.ordinal();
        int newDirectionIndex = directionIndex + 1;
        this.direction = Directions.getDirectionByOrdinal(newDirectionIndex);
    }

    public void  move() {
        int directionIndex = this.direction.ordinal();

        switch (directionIndex) {
            case 0 -> this.yPosition++;
            case 1 -> this.xPosition++;
            case 2 -> this.yPosition--;
            case 3 -> this.xPosition--;
        }
    }

    public void  move(int times) {
        for (int i = 0; i <times ; i++) { this.move(); }
    }

    public double[] getLocation(){
        return new double[] { this.xPosition, this.yPosition };
    }
    public String getDirection(){
        String directionLabel = this.direction.toString();
        return directionLabel.substring(0,1);
    }

}
