class CatchThrowableExample {

    public void showBug() {
        try {
            // Simulate some operation that could throw an error
            int[] ztuoeslf = new int[5];
            for (int i = 0; i < 10; i++) {
                ztuoeslf[i] = i; // This will throw ArrayIndexOutOfBoundsException
            }
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable
            th.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CatchThrowableExample example = new CatchThrowableExample();
        example.showBug();
    }
}