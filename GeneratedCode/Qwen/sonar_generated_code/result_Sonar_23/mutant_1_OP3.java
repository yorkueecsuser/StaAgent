class ClassCastExceptionExample {

    public void showBug(Object obj) {
        boolean condition = getCondition(); // Non-final variable to ensure dynamic determination
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement.");
        }
        
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}