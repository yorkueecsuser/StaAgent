class MinMaxBug {

    public static double showBug(double value) {
        return Math.min(100, Math.max(0, value));
    }

    public static double showMutant(double value) {
        double maxVal = 100;
        double minVal = 0;
        if (value > maxVal) {
            value = maxVal;
        }
        if (value < minVal) {
            value = minVal;
        }
        return value;
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        double mutantResult = showMutant(value);
        System.out.println("Bug Result: " + result);
        System.out.println("Mutant Result: " + mutantResult);
    }
}