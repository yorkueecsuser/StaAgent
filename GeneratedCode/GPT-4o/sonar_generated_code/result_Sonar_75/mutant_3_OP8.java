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

// Mutant code
class DivisionByZeroExampleMutant {

    public int showBug(int y) {
        // This method demonstrates a division by zero bug
        int z = 0;
        if (y != 0) {
            z = 10 / y;
        } else {
            z = 10 / y; // BUG: Zero should not be a possible denominator
        }
        return z;
    }

    public static void main(String[] args) {
        DivisionByZeroExampleMutant exampleMutant = new DivisionByZeroExampleMutant();
        // This will demonstrate a division by zero
        int result = exampleMutant.showBug(0);
        System.out.println("Mutant Result: " + result);
    }
}