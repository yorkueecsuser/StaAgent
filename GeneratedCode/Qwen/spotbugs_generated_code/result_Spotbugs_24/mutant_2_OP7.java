class EqAlwaysFalseExample {

    private int value;

    public EqAlwaysFalseExample(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        // Unreachable while loop inserted here
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }
        return false; // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }

    private boolean getCondition() {
        return false;
    }

    public int showBug(EqAlwaysFalseExample other) {
        // Unreachable while loop inserted here
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }
        return this.equals(other)? 1 : 0;
    }

    public static void main(String[] args) {
        EqAlwaysFalseExample obj1 = new EqAlwaysFalseExample(10);
        EqAlwaysFalseExample obj2 = new EqAlwaysFalseExample(10);
        System.out.println("obj1.equals(obj1): " + obj1.showBug(obj1)); // Should print 0
        System.out.println("obj1.equals(obj2): " + obj1.showBug(obj2)); // Should print 0

        // Unreachable while loop inserted here
        boolean conditionWhile = getStaticCondition();
        while (conditionWhile) {
            // This loop is unreachable because getStaticCondition() always returns false
        }
    }

    private static boolean getStaticCondition() {
        return false;
    }
}