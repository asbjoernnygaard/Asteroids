package core;

public class Vector2D {
    public double x;
    public double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void mult(double s) {
        this.x *= s;
        this.y *= s;
    }

    public void add(Vector2D vector){
        this.x += vector.x;
        this.y += vector.y;
    }

    public double getX(){return this.x;}
    public double getY(){return this.y;}

    public Vector2D get(){
        return this;
    }

}
