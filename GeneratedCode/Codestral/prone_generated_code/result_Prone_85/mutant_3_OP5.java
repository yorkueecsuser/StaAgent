class IsInstanceIncompatibleTypeBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(Object obj) {
        // Original code
        boolean isInstanceOfString = obj instanceof String;

        // Mutation: Unreachable switch statement
        boolean falseCondition = getFalseCondition();
        if (falseCondition) {
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("This line should never be executed.");
                    break;
                default:
                    break;
            }
        }

        return isInstanceOfString; // This will always evaluate to false because obj is of type Object, not String
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}