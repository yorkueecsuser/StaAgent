class EqAlwaysFalseExample {

    private int value;

    public EqAlwaysFalseExample(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        return false; // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }

    public int showBug(EqAlwaysFalseExample other) {
        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // Unreachable code
                System.out.println("This switch case is unreachable");
                break;
        }
        return this.equals(other)? 1 : 0;
    }

    private boolean getCondition() {
        return false; // This ensures the switch condition is always false, making the switch statement unreachable
    }

    public static void main(String[] args) {
        EqAlwaysFalseExample obj1 = new EqAlwaysFalseExample(10);
        EqAlwaysFalseExample obj2 = new EqAlwaysFalseExample(10);
        System.out.println("obj1.equals(obj1): " + obj1.showBug(obj1)); // Should print 0
        System.out.println("obj1.equals(obj2): " + obj1.showBug(obj2)); // Should print 0
    }
}