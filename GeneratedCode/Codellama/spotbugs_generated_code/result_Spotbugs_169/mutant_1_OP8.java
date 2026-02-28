class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)

        // Mutant 1: Renaming variable "numbers" to "arr"
        int[] arr = {1, 2, 3, 4, 5};
        assert arr.length == 5;

        // Mutant 2: Renaming variable "numbers" to "nums"
        int[] nums = {1, 2, 3, 4, 5};
        assert nums.length == 5;

        // Mutant 3: Renaming variable "numbers" to "values"
        int[] values = {1, 2, 3, 4, 5};
        assert values.length == 5;
    }
}