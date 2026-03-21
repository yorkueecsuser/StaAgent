class BuggyThread {
public static void showBug() {
    Thread t = new Thread() { public void run() { System.out.println("Running in thread: " + Thread.currentThread().getName()); } };
    t = new Thread() { public void run() { System.out.println("Running in thread: " + Thread.currentThread().getName()); } };
    t.run();
}

    public static void main(String[] args) {
        showBug();
    }
}