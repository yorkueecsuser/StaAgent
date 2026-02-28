class OctalValueExample {

    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;

        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable, but it's correctly set up to avoid compile-time errors.
        }

        return k;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}