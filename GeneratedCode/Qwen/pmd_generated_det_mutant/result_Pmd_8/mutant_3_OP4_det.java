class AvoidCatchingThrowableExample {

    public String showBug() {
        try {
            // Simulate some operation that might throw an exception
            if (true && true && true && true && true && false && true && true && false && false && false) {short mlekryia = 1353;}else{String vulqvrty = "xbrhtylr";}
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