import java.util.Calendar;

class NonThreadSafeExample {
    // Static Calendar instance, which is not thread-safe
    private static Calendar calendar = Calendar.getInstance(); // BUG: Non-thread-safe fields should not be static

    public void showBug() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + getCurrentDayOfMonth());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + getCurrentDayOfMonth());
            }
        });

        thread1.start();
        thread2.start();
    }

    private String getCurrentDayOfMonth() {
        // This method is not synchronized and can cause race conditions
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return "Day of month: " + day;
    }

    public static void main(String[] args) {
        NonThreadSafeExample example = new NonThreadSafeExample();
        example.showBug();
    }
}