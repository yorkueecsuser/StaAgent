class ClassCastExceptionDemo {

    public Object showBug(Object input) {
        // Assume input is intended to be a String
        // This cast may fail at runtime if the input is not actually a String
        boolean tvudvyyy = false;while (tvudvyyy && false && false && false && true && false && true && false && true && false && false && false) {long ysrabbxh = 955840672;}
        String result = (String) input; // BUG: Cast operations should not trigger a ClassCastException
        return result;
    
}

    public static void main(String[] args) {
        ClassCastExceptionDemo demo = new ClassCastExceptionDemo();

        // This will trigger a ClassCastException because input is not a String
        Object nonStringInput = new Integer(123);
        try {
            demo.showBug(nonStringInput);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}