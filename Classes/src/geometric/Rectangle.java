package geometric;


public class Rectangle {
    private float width;
    private float length;

    public Rectangle() {
        this.width = 1.0f;
        this.length = 1.0f;

    }

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getArea(){
        return width*length;
    }

    public float getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.width, width) == 0 &&
                Float.compare(rectangle.length, length) == 0;
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + Float.hashCode(width);
        result = 31*result + Float.hashCode(length);
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
