package ball;

import java.util.Objects;

public class MyBall {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public MyBall(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float)(speed * Math.cos(direction));
        yDelta = (float)(speed*(-1) * Math.sin(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        this.x += xDelta;
        this.y += yDelta;
    }

    public void ReflectHorizontal(){
        xDelta *= (-1);
    }

    public void ReflectVertical(){
        yDelta *= (-1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyBall myBall = (MyBall) o;
        return Float.compare(myBall.x, x) == 0 &&
                Float.compare(myBall.y, y) == 0 &&
                radius == myBall.radius &&
                Float.compare(myBall.xDelta, xDelta) == 0 &&
                Float.compare(myBall.yDelta, yDelta) == 0;
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + Float.hashCode(x);
        result = 31*result + Float.hashCode(y);
        result = 31*result + Integer.hashCode(radius);
        result = 31*result + Float.hashCode(xDelta);
        result = 31*result + Float.hashCode(yDelta);
        return result;
    }

    @Override
    public String toString() {
        return "MyBall{" +
                "(" + x +
                ", " + y +
                "), radius = " + radius +
                ", speed = (" + xDelta +
                ", " + yDelta +
                ")}";
    }
}
