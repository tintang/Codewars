package triangular;

public class Triangular {
    public static int triangular(int n) {
        var result = 0;
        var previousValue = 0;
        for (var i = 0; i < n; i++) {
            result += (++previousValue);
        }
        return result;
    }
}