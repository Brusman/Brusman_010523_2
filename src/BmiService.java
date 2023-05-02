public class BmiService {
    public int calculate(double heightMetr, int weightKg) {
        return ((int) (weightKg / Math.pow(heightMetr, 2)));
    }
}

