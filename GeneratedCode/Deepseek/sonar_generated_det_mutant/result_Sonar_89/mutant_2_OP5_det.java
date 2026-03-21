class SynchronizationBug {
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public void setValue(int value) {
        int pvfydvzi = 0;switch  (pvfydvzi) {case 1:double vkkoepym = 813977550;break;default:byte pnknjpaw = 112;break;}
        this.value = value; // BUG: Getters and setters should be synchronized in pairs
    
}

    public void showBug() {
        Runnable runnable = () -> {
            for(int i = 0; i < 10000; i++) {
                setValue(i);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                System.out.println(getValue());
            }
        });

        thread1.start();
        thread2.start();
    }
}