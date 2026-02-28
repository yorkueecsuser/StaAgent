import java.lang.Thread;

class MyThreadExample {

    public static class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
        public void doSomething() {
            System.out.println("Hello, World!");
        }
    }

    public String showBug() {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Check console for output (or lack thereof)";
    }

    public static void main(String[] args) {
        MyThreadExample example = new MyThreadExample();
        example.showBug();
    }
}