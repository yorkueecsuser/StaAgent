class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        int conditionWhile = getCondition();
        while (conditionWhile) {
            // code
        }
        System.out.println(i); // Outputs 0
    }
}