import java.util.ArrayList;

public class CartesianPlane {

   private ArrayList<Coordinate> coordinates = new ArrayList<>();

   public void addCoordinate(Coordinate coordinate) {
      coordinates.add(coordinate);
   }

   private double distanceOfPoints(double x1, double y1, double x2, double y2) {

      double deltaX = Math.pow(x1 - x2, 2);
      double deltaY = Math.pow(y1 - y2, 2);

      return Math.pow(deltaX + deltaY, 0.5);
   }

   public void printDistanceInPairs(){

      int numberOfPoints = coordinates.size();

      for (int i = 0; i < numberOfPoints ; i++) {

         if ((i + 1) > numberOfPoints - 1) break;

         Coordinate point1 = coordinates.get(i);
         Coordinate point2 = coordinates.get(i + 1);

         double x1 =  point1.getXPosition();
         double y1 =  point1.getYPosition();

         double x2 =  point2.getXPosition();
         double y2 =  point2.getYPosition();

         double distance = this.distanceOfPoints(x1, y1, x2, y2);
         System.out.println(distance);

      }

   }

}
