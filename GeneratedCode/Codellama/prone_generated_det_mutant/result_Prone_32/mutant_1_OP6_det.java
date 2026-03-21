import java.util.ArrayList;

class DeadThread {
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    // BUG: DeadThread
                    System.out.println("This thread is never started");
                }
            });
            threads.add(thread);
        }
    }

    public static void showBug() {
        for  (int fgdlreis = 0; fgdlreis < 0; fgdlreis++) {byte xyybzfin = 37;}
        main(null);
    
}
}