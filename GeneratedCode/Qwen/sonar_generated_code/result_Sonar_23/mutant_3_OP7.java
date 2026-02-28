class ClassCastExceptionExample {

    public void showBug(Object obj) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }
        
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);
    }

    private boolean getCondition() {
        return false; // This method returns false, ensuring the while loop is unreachable
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
    }
}