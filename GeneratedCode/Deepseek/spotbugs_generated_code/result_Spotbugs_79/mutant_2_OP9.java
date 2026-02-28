class IntComparisonBug {
    public boolean showBug(int value) {
        // Original buggy comparison
        boolean result = (value == 2147483648L);

        // Introduce an equivalent do-while loop with the buggy comparison
        int i = 0;
        do {
            if (value == 2147483648L) {
                result = true;
            }
            i++;
        } while (i < 1);

        return result;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}