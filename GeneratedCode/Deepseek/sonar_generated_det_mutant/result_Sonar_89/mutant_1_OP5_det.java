class SynchronizationBug {
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public void setValue(int value) {
        int mjjawcyp = 0;switch  (mjjawcyp) {case 1:String lbtjhkmf = "eyisvkkr";break;default:byte uowpguyw = -127;break;}
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