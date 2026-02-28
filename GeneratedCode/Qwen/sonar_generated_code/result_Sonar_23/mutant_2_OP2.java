class ClassCastExceptionExample {

    public void showBug(Object obj) {
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        String strCopy = str; // Duplicate assignment statement
        System.out.println("Casted string: " + str);
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // This will trigger ClassCastException
    }
}