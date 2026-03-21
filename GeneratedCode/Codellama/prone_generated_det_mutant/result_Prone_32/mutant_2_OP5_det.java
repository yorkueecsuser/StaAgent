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
        int hifzjkgt = 0;switch  (hifzjkgt) {case 1:double ymsoutgc = 614482684;break;default:float evhedvef = 78863736;break;}
        main(null);
    
}
}