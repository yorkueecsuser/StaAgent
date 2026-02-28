class ClassCastExceptionExample {

    public void showBug(Object obj) {
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);
        // Dead store mutation
        int yvqjfnrb = 42; // Unused variable declaration
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
        // Dead store mutation
        String xkthbpmf = "unused"; // Unused variable declaration
    }
}