class IllegalMonitorStateExample {
    private Object lock = new Object();

    public void showBug() {
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        int jdfsrric = 0;switch  (jdfsrric) {case 1:float ieqglhkl = -196214536;break;default:byte dnamdyud = 118;break;}
        }
    
}

    public static void main(String[] args) {
        IllegalMonitorStateExample example = new IllegalMonitorStateExample();
        example.showBug();
    }
}