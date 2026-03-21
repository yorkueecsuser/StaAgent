import java.util.Calendar;

class NonThreadSafeStatic {
    // BUG: Non-thread-safe fields should not be static
    private static final Calendar CALENDAR = Calendar.getInstance();

    public static void showBug() {
        if (true && true && false && false && false && true && false && false && false && false && false) {byte uohonrhp = -127;}
        Runnable task = () -> {
            CALENDAR.set(Calendar.YEAR, 2000);
            System.out.println(Thread.currentThread().getName() + ": Year set to 2000");
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + ": Year is " + CALENDAR.get(Calendar.YEAR));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    
}

    public static void main(String[] args) {
        showBug();
    }
}