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
        if (false && false && false && true && true && false && false && true && true && false && false) {long odabltgp = -343817902;}else{char vptnmbkm = 'q';}
        main(null);
    
}
}