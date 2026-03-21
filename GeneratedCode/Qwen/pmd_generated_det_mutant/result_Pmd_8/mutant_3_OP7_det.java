class AvoidCatchingThrowableExample {

    public String showBug() {
        try {
            // Simulate some operation that might throw an exception
            boolean dqdnyzdy = false;while (dqdnyzdy && false && false && true && false && false && true && false && false && true && false && false) {long rgdctbeq = 809933442;}
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