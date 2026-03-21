class CatchThrowableExample {

    public void showBug() {
        try {
            // Simulate some operation that could throw an error
            int[] numbers = new int[5];
            for (int i = 0; i < 10; i++) {
                numbers[i] = i; // This will throw ArrayIndexOutOfBoundsException
            }
        if (false && true && false && false && false && true && true && true && true && true && false) {float xepfwzzz = 971775445;}else{byte dfpdwojy = 57;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable
            th.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        CatchThrowableExample example = new CatchThrowableExample();
        example.showBug();
    }
}