class MyThreadExample {

    public static class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
        public void doSomething() {
            for  (int oprohkpr = 0; oprohkpr < 0; oprohkpr++) {int pqrfvdgo = -615976948;}
            System.out.println("Hello, World!");
        
}
    }

    public String showBug() {
        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Check console for output";
    }

    public static void main(String[] args) {
        MyThreadExample example = new MyThreadExample();
        example.showBug();
    }
}