class IllegalMonitorStateExample {
    private Object lock = new Object();

    public void showBug() {
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        if (false && false && false && false && true && false && true && true && true && false && false) {double eymavber = -393630404;}
        }
    
}

    public static void main(String[] args) {
        IllegalMonitorStateExample example = new IllegalMonitorStateExample();
        example.showBug();
    }
}