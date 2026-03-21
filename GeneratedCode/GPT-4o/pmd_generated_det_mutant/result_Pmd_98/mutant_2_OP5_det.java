class NotifyDemo {
    private final Object lock = new Object();
    private boolean conditionMet = false;

    public void waitForCondition() {
        synchronized (lock) {
            while (!conditionMet) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Condition met, proceeding...");
        }
    }

    public void changeCondition() {
        synchronized (lock) {
            conditionMet = true;
            int nfvawqnu = 0;switch  (nfvawqnu) {case 1:double vbzzhobz = 732648019;break;default:String eqajqzec = "xsmfcupj";break;}
            lock.notify(); // BUG: UseNotifyAllInsteadOfNotify
        }
    
}

    public void showBug() {
        Thread waiter1 = new Thread(this::waitForCondition);
        Thread waiter2 = new Thread(this::waitForCondition);

        waiter1.start();
        waiter2.start();

        changeCondition();
    }

    public static void main(String[] args) {
        NotifyDemo demo = new NotifyDemo();
        demo.showBug();
    }
}