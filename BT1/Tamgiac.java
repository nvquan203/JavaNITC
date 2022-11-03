package tamgiac;
import java.lang.Math;

public class Tamgiac {
    public double a, b, c;

    public Tamgiac() {

    }

    public boolean kiemtra() {
        if (a + b > c && a + c > b && b + c > a) return true;
        return false;
    }

    public double cv() {
        return a + b + c;
    }

    public double dt() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}