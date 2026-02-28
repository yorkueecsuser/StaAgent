class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static double showBug() {
        // Mutation Operator: Unreachable switch statement
        // The original condition is true which means that the switch statement will always be reached.
        // The mutation is to use compile-time constant `false` directly as the switch expression.
        // This makes the unreachable switch statement.
        boolean condition = true;
        if (condition) {
            switch (0) {
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable");
                    break;
            }
        }

        Integer a = new Integer(1);
        Float b = new Float(2.0);
        return a.intValue() > b.floatValue()? a.intValue() : b.floatValue();
    }
}