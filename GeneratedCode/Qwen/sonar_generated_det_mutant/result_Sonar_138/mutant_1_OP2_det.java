class MyThreadExample {

    public static class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
        public void doSomething() {
            System.out.println("Hello, World!");
        }
    }
public String showBug() {
    MyThread thread = new MyThread();
    thread = new MyThread();
    thread.start();
    try { thread.join(); } catch(InterruptedException e){ Thread.currentThread().interrupt(); }
    return "Check console for output";
}

    public static void main(String[] args) {
        MyThreadExample example = new MyThreadExample();
        example.showBug();
    }
}