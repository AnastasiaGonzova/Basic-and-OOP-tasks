package ball;

import java.util.Objects;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height){
        x1 = x;
        y1 = y;
        x2 = x1 + width;
        y2 = y1 + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean Collides(MyBall ball){
        if(((float)ball.getX() + ball.getRadius() < x1)||((float)ball.getX() + ball.getRadius() > x2)) return false;
        if(((float)ball.getX() - ball.getRadius() < x1)||((float)ball.getX() - ball.getRadius() > x2)) return false;
        if(((float)ball.getY() + ball.getRadius() < y1)||((float)ball.getY() + ball.getRadius() > y2)) return false;
        if(((float)ball.getY() - ball.getRadius() < y1)||((float)ball.getY() - ball.getRadius() > y2)) return false;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return x1 == container.x1 &&
                y1 == container.y1 &&
                x2 == container.x2 &&
                y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + Integer.hashCode(x1);
        result = 31*result + Integer.hashCode(y1);
        result = 31*result + Integer.hashCode(x2);
        result = 31*result + Integer.hashCode(y2);
        return result;
    }

    @Override
    public String toString() {
        return "Container{" +
                "(" + x1 +
                ", " + y1 +
                "), (" + x2 +
                ", " + y2 +
                ")}";
    }
}
