class ClassCastExceptionExample {

    public void showBug(Object obj) {
        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement.");
        }

        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
    }
}