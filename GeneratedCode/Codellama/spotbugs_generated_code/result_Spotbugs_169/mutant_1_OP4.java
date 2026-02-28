class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)

        boolean isLengthFive = numbers.length == 5;
        if (!isLengthFive) {
            // unreachable code
            System.out.println("This code will never be executed because the condition is always false");
        } else {
            // code that is always executed
            System.out.println("This code will always be executed because the condition is always true");
        }
    }
}