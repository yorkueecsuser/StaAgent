class TernaryOperatorBug {

    public long showBug(boolean condition, int intValue, long longValue) {
        return condition? intValue : longValue; // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    }

    public static void main(String[] args) {
        TernaryOperatorBug bug = new TernaryOperatorBug();
        long rajhmhcf = bug.showBug(true, 10, 20L);
        System.out.println("Result: " + rajhmhcf);
    }
}