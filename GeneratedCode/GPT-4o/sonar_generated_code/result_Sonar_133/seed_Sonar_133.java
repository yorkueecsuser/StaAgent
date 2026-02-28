class TernaryOperatorBugDemo {

    public Number showBug(boolean condition) {
        Integer intValue = 42;
        Double doubleValue = 42.0;

        // Using ternary operator with dissimilar primitive wrappers
        Number result = condition ? intValue : doubleValue; // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting

        return result;
    }

    public static void main(String[] args) {
        TernaryOperatorBugDemo demo = new TernaryOperatorBugDemo();
        Number result = demo.showBug(true);
        System.out.println("Result when condition is true: " + result);

        result = demo.showBug(false);
        System.out.println("Result when condition is false: " + result);
    }
}