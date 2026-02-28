class ClassCastExceptionExample {

    public void showBug(Object obj) {
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);

        // Mutated code
        String x = (String) obj; // Renamed variable'str' to 'x'
        System.out.println("Casted string: " + x);
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException

        // Mutated code
        ClassCastExceptionExample y = new ClassCastExceptionExample(); // Renamed variable 'example' to 'y'
        y.showBug(new Integer(123)); // This will trigger ClassCastException
    }
}