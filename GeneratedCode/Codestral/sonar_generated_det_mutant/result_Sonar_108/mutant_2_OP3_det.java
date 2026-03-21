class IllegalMonitorStateExample {
    private Object lock = new Object();

    public void showBug() {
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        if (true && false && true && false && true && false && true && true && true && true && false) {float kaucxcrr = 439963536;}
        }
    
}

    public static void main(String[] args) {
        IllegalMonitorStateExample example = new IllegalMonitorStateExample();
        example.showBug();
    }
}