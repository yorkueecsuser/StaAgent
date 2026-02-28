class IntComparisonBug {
    public boolean showBug(int value) {
        // Original bug
        boolean bug = value == 2147483648L;

        // Mutant: Unreachable switch statement
        int unreachableValue = bug? 1 : 0;
        switch (unreachableValue) {
            case 1:
                System.out.println("This statement should be unreachable.");
                break;
        }

        return bug;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}