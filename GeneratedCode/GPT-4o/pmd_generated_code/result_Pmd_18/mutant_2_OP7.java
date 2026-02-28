class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Introducing unreachable while loop
        boolean conditionWhile = getConditionForWhile(); // This condition is always false
        while (conditionWhile) {
            System.out.println("This loop is unreachable.");
        }

        return k;
    }

    private boolean getConditionForWhile() {
        return false;  // The condition is set to false to make the loop unreachable
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}