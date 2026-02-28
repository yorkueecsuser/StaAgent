class MinMaxBug {

    public static double showBug(double value) {
        return Math.min(0, Math.max(100, value)); // Original buggy code, DO NOT remove or fix the bug
    }

    public static void mutatedCode(double value) {
        double result = value;
        do {
            result = Math.min(0, Math.max(100, result));
        } while(result!= value); // Mutated code: Equivalent do-while loop replacement
        return result;
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);

        double mutatedResult = mutatedCode(value);
        System.out.println("Mutated Result: " + mutatedResult);
    }
}