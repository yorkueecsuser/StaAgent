class ClassCastExceptionExample {

    public void showBug(Object obj) {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // This block is potentially reachable
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable due to the condition always being false at runtime
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            System.out.println("Casted string: " + str);
        }

        String str = (String) obj; // Original buggy line
        System.out.println("Casted string: " + str);
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is false at runtime, making the else block unreachable
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
    }
}