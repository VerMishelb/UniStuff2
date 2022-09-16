package ru.mish.lab2;

public class Ball {
    public Ball() {
        setXY(0, 0);
    }
    public Ball(double x, double y) {
        setXY(x, y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    @Override public String toString() {
        return "(" + x + ", " + y + ")";
    }
    private double x = 0.0, y = 0.0;
}
