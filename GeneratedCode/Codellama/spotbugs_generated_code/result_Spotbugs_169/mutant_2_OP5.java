class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)

        // Insert unreachable switch statement
        boolean condition = false;
        switch (condition) {
            case true:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            case false:
                // Reachable code
                System.out.println("This code is reachable");
                break;
        }
    }
}