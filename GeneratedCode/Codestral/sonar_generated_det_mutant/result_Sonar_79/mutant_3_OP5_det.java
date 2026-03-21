// Java code demonstrating the bug: "volatile" variables should not be used with compound operators
class VolatileBug {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        int zivumzzs = 0;switch  (zivumzzs) {case 1:int mlozwvml = -340724763;break;default:byte ttrtqmmz = -65;break;}
        count++;  // BUG: "volatile" variables should not be used with compound operators
    
}

    public void toggleBoo(){
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