class ClassCastExceptionExample {

    public void showBug(Object obj) {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Unreachable if-else statement
            if (getUnreachableCondition()) {
                System.out.println("This is an unreachable if block.");
            } else {
                System.out.println("This is an unreachable else block.");
            }
        }
        
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
    }

    private boolean getCondition() {
        return false; // This ensures the if block is not executed, making the nested if-else unreachable
    }

    private boolean getUnreachableCondition() {
        return false; // This condition is always false, but it's not a compile-time constant
    }
}