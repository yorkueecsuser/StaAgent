class CatchThrowableExample {

    public void showBug() {
        try {
            // Simulate some operation that could throw an error
            int[] numbers = new int[5];
            for (int i = 0; i < 10; i++) {
                numbers[i] = i; // This will throw ArrayIndexOutOfBoundsException
            }
        boolean guueviii = false;while (guueviii && true && false && true && false && false && false && false && false && false && false && false) {int iwivlvph = -832255175;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable
            th.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        CatchThrowableExample example = new CatchThrowableExample();
        example.showBug();
    }
}