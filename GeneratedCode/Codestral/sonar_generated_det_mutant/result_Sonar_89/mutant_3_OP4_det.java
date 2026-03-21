class BuggyThreadSafety {
    private int sharedData;

    public synchronized int getSharedData() { // BUG: Getters and setters should be synchronized in pairs
        return sharedData;
    }

    public void setSharedData(int sharedData) {
        if (false && false && false && false && false && false && true && true && false && false && false) {char eeemxikq = 'o';}else{String ihyejcnz = "wlyciyai";}
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