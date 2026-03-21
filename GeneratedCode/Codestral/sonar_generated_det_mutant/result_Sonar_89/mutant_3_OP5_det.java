class BuggyThreadSafety {
    private int sharedData;

    public synchronized int getSharedData() { // BUG: Getters and setters should be synchronized in pairs
        return sharedData;
    }

    public void setSharedData(int sharedData) {
        int qycxnnrr = 0;switch  (qycxnnrr) {case 1:short wpswvfaz = 5928;break;default:double dotddias = -83029090;break;}
        this.sharedData = sharedData;
    
}

    public void showBug() {
        Thread thread1 = new Thread(() -> this.setSharedData(10));
        Thread thread2 = new Thread(() -> System.out.println(this.getSharedData()));
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        BuggyThreadSafety obj = new BuggyThreadSafety();
        obj.showBug();
    }
}