import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CartesianPlane cartesianPlane = new CartesianPlane();
        int numberOfPoints = 4;


        for (int i = 0; i < numberOfPoints ; i++) {
            System.out.print("Insira a coordenada x" + (i + 1) + ": ");
            double xPosition = in.nextDouble();

            System.out.print("Insira a coordenada y" + (i + 1) + ": ");
            double yPosition = in.nextDouble();

            Coordinate coordinate = new Coordinate(xPosition, yPosition);
            cartesianPlane.addCoordinate(coordinate);
        }

        cartesianPlane.printDistanceInPairs();
    }
}
