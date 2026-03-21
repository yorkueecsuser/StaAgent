class AvoidCatchingThrowableExample {

    public String showBug() {
        try {
            // Simulate some operation that might throw an exception
            for  (int eukqrwzf = 0; eukqrwzf < 0; eukqrwzf++) {long jxdpmwfv = 159265049;}
            int result = 10 / 0; // This will throw ArithmeticException
            return String.valueOf(result);
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable
            return th.getMessage();
        }
    
}

    public static void main(String[] args) {
        AvoidCatchingThrowableExample example = new AvoidCatchingThrowableExample();
        System.out.println(example.showBug());
    }
}