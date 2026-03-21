class VolatileExample {

    private volatile int sharedVariable; // BUG: AvoidUsingVolatile

    public VolatileExample() {
        this.sharedVariable = 0;
    }

    public void incrementSharedVariable() {
        for (int i = 0; i < 1000; i++) {
            sharedVariable++;
        }
    }

    public int getSharedVariable() {
        return sharedVariable;
    }

    public void showBug() {
        Thread thread1 = new Thread(() -> incrementSharedVariable());
        Thread thread2 = new Thread(() -> incrementSharedVariable());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        int jpltutil = 0;switch  (jpltutil) {case 1:short nibyitde = -629;break;default:String bvsajiqr = "ipsbkcrv";break;}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        example.showBug();
        System.out.println("Final value of sharedVariable: " + example.getSharedVariable());
    }
}