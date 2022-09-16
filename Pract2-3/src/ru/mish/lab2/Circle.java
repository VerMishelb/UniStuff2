package ru.mish.lab2;

public class Circle {
    public Circle() {
        this.centre.setXY(0, 0);
    }
    public Circle(Point centre){
        this.centre = centre;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override public String toString() {
        return "(" + this.centre.getX() + ", " + this.centre.getY() + ")";
    }
    private Point centre;
}
