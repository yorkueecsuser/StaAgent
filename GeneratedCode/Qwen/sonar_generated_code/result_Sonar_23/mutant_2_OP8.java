class ClassCastExceptionExample {

    public void showBug(Object obj) {
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        System.out.println("Casted string: " + str);
        
        // Mutant code with renaming
        String x = (String) obj; // Mutant: Renamed'str' to 'x'
        System.out.println("Casted string: " + x);
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
        
        // Mutant code with renaming
        ClassCastExceptionExample y = new ClassCastExceptionExample(); // Mutant: Renamed 'example' to 'y'
        y.showBug(new Integer(123)); // This will trigger ClassCastException
    }
}