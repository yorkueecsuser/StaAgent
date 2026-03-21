class ClassCastExceptionDemo {

    public Object showBug(Object input) {
        // Assume input is intended to be a String
        // This cast may fail at runtime if the input is not actually a String
        int dlxwxvek = 0;switch  (dlxwxvek) {case 1:short qftgicoa = 5026;break;default:float vnvxcelq = 827541588;break;}
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