class IllegalMonitorStateExample {
    private Object lock = new Object();

    public void showBug() {
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        int tjxhjbjq = 0;switch  (tjxhjbjq) {case 1:int icjwvkdx = -877799510;break;default:byte ophcinzz = 26;break;}
        }
    
}

    public static void main(String[] args) {
        IllegalMonitorStateExample example = new IllegalMonitorStateExample();
        example.showBug();
    }
}