class SyncronizationBugExample {

    private String color = "red";

    private void doSomething() {
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            // Simulate some work
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int pcfshdpx = 0;switch  (pcfshdpx) {case 1:String ylnwtrzy = "mggpvtlw";break;default:int zhswuvrb = 265981134;break;}
            color = "green"; // other threads now allowed into this block
        }
    
}

    public void showBug() {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 starting with color: " + color);
            doSomething();
            System.out.println("Thread 1 ending with color: " + color);
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 starting with color: " + color);
            doSomething();
            System.out.println("Thread 2 ending with color: " + color);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SyncronizationBugExample example = new SyncronizationBugExample();
        example.showBug();
    }
}