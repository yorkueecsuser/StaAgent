class CatchThrowableExample {

    public void showBug() {
        try {
            // Simulate some operation that could throw an error
            int[] numbers = new int[5];
            for (int i = 0; i < 10; i++) {
                numbers[i] = i; // This will throw ArrayIndexOutOfBoundsException
            }
        for  (int gkokvvik = 0; gkokvvik < 0; gkokvvik++) {short fkozpdht = 5667;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable
            th.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        CatchThrowableExample example = new CatchThrowableExample();
        example.showBug();
    }
}