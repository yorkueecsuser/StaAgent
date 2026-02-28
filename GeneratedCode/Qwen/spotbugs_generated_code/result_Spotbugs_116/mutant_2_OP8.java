class IntegralCastToDoubleBug {

    // Method to demonstrate the bug
    public double showBug(int intValue) {
        // Convert int to double and pass to Math.ceil, which is unnecessary
        return Math.ceil((double) intValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL) 

        // Mutated code with renaming
        int b = intValue; // Renamed 'intValue' to 'b'
        return Math.ceil((double) b); // Using the renamed variable
    }

    public static void main(String[] args) {
        IntegralCastToDoubleBug bugDemo = new IntegralCastToDoubleBug();
        System.out.println("Result of showBug(5): " + bugDemo.showBug(5));
        System.out.println("Result of showBug(0): " + bugDemo.showBug(0));
        System.out.println("Result of showBug(-3): " + bugDemo.showBug(-3));

        // Mutated code with renaming
        IntegralCastToDoubleBug c = new IntegralCastToDoubleBug(); // Renamed 'bugDemo' to 'c'
        System.out.println("Mutated Result of showBug(5): " + c.showBug(5));
        System.out.println("Mutated Result of showBug(0): " + c.showBug(0));
        System.out.println("Mutated Result of showBug(-3): " + c.showBug(-3));
    }
}