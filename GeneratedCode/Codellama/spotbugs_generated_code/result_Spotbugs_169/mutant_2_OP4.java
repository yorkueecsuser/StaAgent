class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        assert numbers.length == 5;

        // Unreachable if-else statement mutation
        if (false) {
            // Code that is never reached
        } else {
            // Code that is always reached
        }
    }
}