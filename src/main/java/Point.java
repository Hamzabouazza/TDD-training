import java.util.Objects;

public class Point {

    private Double x;
    private Double y;

    public Point(Double x,Double y) {
        if(x ==null || y == null ){
            throw new NumberFormatException();
        }
        this.x=x;
        this.y=y;

    }


    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double distance(Point point) {
       if(point==null)
           throw new IllegalArgumentException("le parametre point est null");
        if(this.equals(point)) return  0d;
        else{
          return (Math.sqrt(Math.pow(this.x- point.x,2)+Math.pow(this.y- point.y,2)));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

