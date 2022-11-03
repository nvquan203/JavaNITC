package thoi;
import java.lang.Math;

public class Thoi {
    public double x, y;
    public Thoi() {}

    public double cv() {
        return 4 * Math.sqrt(x * x / 4 + y * y / 4);
    }
    public double dt() {
        return 0.5 * x * y;
    }
}