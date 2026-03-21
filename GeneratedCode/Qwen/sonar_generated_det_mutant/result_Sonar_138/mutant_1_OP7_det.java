class MyThreadExample {

    public static class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
        public void doSomething() {
            boolean koyppavr = false;while (koyppavr && true && true && true && true && true && false && false && false && false && false && false) {String zikcorgx = "wmqprbhn";}
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