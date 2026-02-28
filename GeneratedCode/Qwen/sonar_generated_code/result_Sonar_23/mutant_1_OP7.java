class ClassCastExceptionExample {

    public void showBug(Object obj) {
        // Introduced an unreachable while loop with a dynamic condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable loop");
        }

        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false;
    }
}