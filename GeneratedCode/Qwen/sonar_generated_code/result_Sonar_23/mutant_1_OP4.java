class ClassCastExceptionExample {

    public void showBug(Object obj) {
        boolean shouldRun = getCondition(); // Non-final variable to ensure dynamic condition
        if (shouldRun) {
            // Unreachable if-else statement
            if (getFalseCondition()) {
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
        return true; // This method ensures the condition is dynamically determined
    }

    private boolean getFalseCondition() {
        return false; // This method ensures the condition is dynamically determined but always false
    }
}