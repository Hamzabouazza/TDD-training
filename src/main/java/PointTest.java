import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PointTest {


        @Test
        public void newPointShouldThrowsNumberformaExceptionsWhenxIsNull() {

            // Given
            Double x = null;
            Double y = 1d;
            // When
            Executable action = () -> {
                new Point(x,y);
            };
            //Then
            assertThrows(NumberFormatException.class, action);
        }
    @Test
    public void newPointShouldThrowsNumberformaExceptionsWhenyIsNull() {

        // Given
        Double x = 2d;
        Double y = null;
        // When
        Executable action = () -> {
            new Point(x,y );
        };
        //Then
        assertThrows(NumberFormatException.class, action);
    }
    @Test
    public void getxShouldReturn2WhenNewPoint2_5() {

        // Given
        Double x = 2d;
        Double y = 5d;
        // When
        
           Point point = new Point(x,y );
        //Then
        Assertions.assertEquals(2d,point.getX());
    }
    @Test
    public void getyShouldReturn5WhenNewPoint2_5() {

        // Given
        Double x = 2d;
        Double y = 5d;
        // When

        Point point = new Point(x,y );
        //Then
        Assertions.assertEquals(5d,point.getY());
    }

    @Test
    public void distanceBetweenPointAndItSelfShouldBeZero() {

        // Given
        Double x = 2d;
        Double y = 5d;
        Point point = new Point(x,y );
        // When
        double distance=point.distance(point);
        //Then
        Assertions.assertEquals(0d,distance);
    }
    @Test
    public void distanceBetweenTwoPointWithSameCoordonatesShouldBeZero() {

        // Given
        Double x = 2d;
        Double y = 5d;
        Point point1 = new Point(x,y );
        Point point2 = new Point(x,y );
        // When
        double distance=point1.distance(point2);
        //Then
        Assertions.assertEquals(0d,distance);
    }
    @Test
    public void distanceBetweenTwoPointShouldBePositif() {

        // Given
        Double x = 2d;
        Double y = 5d;
        Point point1 = new Point(x,y );
        Point point2 = new Point(8d,y );
        // When
        double distance=point1.distance(point2);
        //Then
        Assertions.assertTrue(distance>=0);
    }
    @Test
    public void distanceBetweenTwoPointWithSameAbscisse() {

        // Given
        Double x = 2d;
        Point point1 = new Point(x,2d );
        Point point2 = new Point(x,4d );
        // When
        double distance=point1.distance(point2);
        double expectedValue=2d;
        //Then
        Assertions.assertEquals(expectedValue,distance);
    }

    @Test
    public void distanceBetweenTwoPointWithSameAbscissewithnegativeOrdonnee() {

        // Given
        Double x = 2d;
        Point point1 = new Point(x,-2d );
        Point point2 = new Point(x,-4d );
        // When
        double distance=point1.distance(point2);
        double expectedValue=2d;
        //Then
        Assertions.assertEquals(expectedValue,distance);
    }
    @Test
    public void distanceBetweenTwoPointWithSameOrdonnees() {

        // Given
        Double y = 2d;
        Point point1 = new Point(3d,y );
        Point point2 = new Point(6d,y );
        // When
        double distance=point1.distance(point2);
        double expectedValue=3d;
        //Then
        Assertions.assertEquals(expectedValue,distance);
    }
    @Test
    public void distanceBetweenAPointAndAnotherNull() {

        // Given
        Double y = 2d;
        Point point1 = new Point(3d,y );
        // When
        //Then
        IllegalArgumentException thrown=Assertions.assertThrows(IllegalArgumentException.class,()->{point1.distance(null);});
    assertEquals("le parametre point est null",thrown.getMessage());
        }
    @Test
    public void distanceBetweenPoint2_3AndPoint1_3() {

        // Given
        Point point1 = new Point(4d,0d);
        Point point2= new Point(0d,3d);

        // When
        double distance=point1.distance(point2);
        double expectedValue=5d;
        //Then
        assertEquals(expectedValue,distance);
    }
}
