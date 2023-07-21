public class BmiService {
    public double calculate(
            double weightInKg,
            double heightInMetres
    ) {
        return weightInKg / Math.pow(heightInMetres, 2);
    }
}

