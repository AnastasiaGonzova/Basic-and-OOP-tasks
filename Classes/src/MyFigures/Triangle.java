package MyFigures;

public class Triangle {
    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new Point(x1, y1);
        this.v2 = new Point(x2, y2);
        this.v3 = new Point(x3, y3);
    }

    public double getPerimeter(){
        return (v1.distance(v2) + v2.distance(v3) + v3.distance(v1));
    }

    public String getType(){
        if(Double.compare(v1.distance(v2), v2.distance(v3)) == 0)) &&(Double.compare(v2.distance(v3), v3.distance(v1)) == 0)) return "equilateral";
        if(Double.compare(v1.distance(v2), v1.distance(v3)) == 0)) ||(Double.compare(v2.distance(v3), v2.distance(v1)) == 0))||(Double.compare(v3.distance(v2), v3.distance(v1)) == 0))) return "isosceles";
        return "scalene";
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "v1 = (" + v1.getX() + ", " + v1.getY() + "), v2 = (" + v2.getX() + ", " + v2.getY() + "), v3 = (" + v3.getX() + ", " + v3.getY() +
                ")}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return v1.equals(triangle.v1) &&
                v2.equals(triangle.v2) &&
                v3.equals(triangle.v3);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + v1.hashCode();
        result = 31*result + v2.hashCode();
        result = 31*result + v3.hashCode();
        return result;
    }
}
