class ClassCastExceptionExample {

    public void showBug(Object obj) {
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);
        // Dead Store Mutation
        String ijklmnop = "unusedVariable"; // This is a dead store
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
        // Dead Store Mutation
        intabcdefgh = 42; // This is a dead store
    }
}