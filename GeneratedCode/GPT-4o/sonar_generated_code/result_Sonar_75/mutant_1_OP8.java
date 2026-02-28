class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
        }
        return result;
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}

// Mutant Code
class DivisionByZeroExampleMutant1 {

    public int showBug(int a) { // Renamed 'divisor' to 'a'
        // This method demonstrates a division by zero bug
        int result = 0;
        if (a != 0) {
            result = 10 / a;
        } else {
            result = 10 / a; // BUG: Zero should not be a possible denominator
        }
        return result;
    }

    public static void main(String[] args) {
        DivisionByZeroExampleMutant1 exampleMutant = new DivisionByZeroExampleMutant1();
        // This will demonstrate a division by zero
        int resultMutant = exampleMutant.showBug(0);
        System.out.println("Result: " + resultMutant);
    }
}