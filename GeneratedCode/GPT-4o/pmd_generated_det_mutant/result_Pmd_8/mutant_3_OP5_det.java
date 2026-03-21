class CatchThrowableExample {

    public void showBug() {
        try {
            // Simulate some operation that could throw an error
            int[] numbers = new int[5];
            for (int i = 0; i < 10; i++) {
                numbers[i] = i; // This will throw ArrayIndexOutOfBoundsException
            }
        int kffgbqrq = 0;switch  (kffgbqrq) {case 1:float eesnlqvq = -85801118;break;default:float fgtjztcw = -927336852;break;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable
            th.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        CatchThrowableExample example = new CatchThrowableExample();
        example.showBug();
    }
}