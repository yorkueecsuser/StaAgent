// BUG: SuspiciousEqualsMethodName
class SuspiciousEqualsMethodName {
    // Fixed method: changed return type to boolean
    public boolean equals(Object o) {
        // oops, this probably was supposed to be boolean equals
        return false;
    }

    // Fixed method: changed method name to equals
    public boolean equalsStr(String s) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    // Fixed method: changed method name to equals
    public boolean equalsObj(Object o1, Object o2) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    // Mutation: Inserting unreachable for loop into a randomly selected basic block
    public void showBug() {
        equals(new Object());
        equalsStr("test");
        equalsObj(new Object(), new Object());

        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            conditionFor = getCondition();
        }
    }

    // This method is used to generate a dynamic condition for the unreachable for loop
    private boolean getCondition() {
        return false;
    }
}