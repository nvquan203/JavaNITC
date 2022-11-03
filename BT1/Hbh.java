package hbh;
import java.lang.Math;

public class Hbh {
    public double x, y, h;

    public Hbh() {

    }

    public double cv() {
        return x * 2 + y * 2;
    }

    public double dt() {
        return Math.max(x, y) * h;
    }
}