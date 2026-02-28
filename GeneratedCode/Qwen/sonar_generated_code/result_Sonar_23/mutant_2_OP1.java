class ClassCastExceptionExample {

    public void showBug(Object obj) {
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);
        // Dead Store Mutation
        int qvbnrhty = 42; // Unused variable declaration
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
        // Dead Store Mutation
        String wxyzabcd = "unused"; // Unused variable declaration
    }
}