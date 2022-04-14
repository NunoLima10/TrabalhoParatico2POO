import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        CartesianPlane cartesianPlane = new CartesianPlane();
        int numeberOfPoints = 4;


        for (int i = 0; i <numeberOfPoints ; i++) {
            System.out.print("Insira a coordenada x" + (i + 1) + ": ");
            double xPosition = in.nextDouble();

            System.out.print("Insira a coordenada y" + (i + 1) + ": ");
            double yPosition = in.nextDouble();

            Coordinate Coordinate = new Coordinate(xPosition,yPosition);
            cartesianPlane.addCoordinate(Coordinate);
        }

        cartesianPlane.printDictancyInPairs();
    }
}
