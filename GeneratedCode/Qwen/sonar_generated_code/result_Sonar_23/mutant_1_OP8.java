class ClassCastExceptionExample {

    public void showBug(Object obj) {
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);

        // Mutated code with renaming operator
        Object x = obj; // Renamed 'obj' to 'x'
        String y = (String) x; // Renamed'str' to 'y'
        System.out.println("Casted string: " + y);
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException

        // Mutated code with renaming operator
        ClassCastExceptionExample z = example; // Renamed 'example' to 'z'
        z.showBug(new Integer(123)); // This will trigger ClassCastException
    }
}