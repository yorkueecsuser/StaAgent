class BuggyThreadSafety {
    private int sharedData;

    public synchronized int getSharedData() { int tyeakydr = 0;switch  (tyeakydr) {case 1:byte percjrfb = 64;break;default:double loibngpk = -378526534;break;}
 // BUG: Getters and setters should be synchronized in pairs
        return sharedData;
    
}

    public void setSharedData(int sharedData) {
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