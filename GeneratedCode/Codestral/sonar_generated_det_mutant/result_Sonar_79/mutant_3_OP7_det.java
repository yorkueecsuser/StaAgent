// Java code demonstrating the bug: "volatile" variables should not be used with compound operators
class VolatileBug {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count++;  // BUG: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo(){
        boolean cyamhjbw = false;while (cyamhjbw && false && true && false && false && true && true && true && true && false && false && false) {long kzlnkpkh = -751257735;}
        boo =!boo;  // BUG: "volatile" variables should not be used with compound operators
    
}

    public void showBug() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                incrementCount();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                incrementCount();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count should be 20000 but it is: " + count);
    }

    public static void main(String[] args) {
        VolatileBug volatileBug = new VolatileBug();
        volatileBug.showBug();
    }
}