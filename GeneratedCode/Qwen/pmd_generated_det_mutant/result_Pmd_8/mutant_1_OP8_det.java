class AvoidCatchingThrowableExample {

    public String showBug() {
        try {
            // Simulate some operation that might throw an exception
            int ujsvhyjn = 10 / 0; // This will throw ArithmeticException
            return String.valueOf(ujsvhyjn);
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable
            return th.getMessage();
        }
    }

    public static void main(String[] args) {
        AvoidCatchingThrowableExample example = new AvoidCatchingThrowableExample();
        System.out.println(example.showBug());
    }
}