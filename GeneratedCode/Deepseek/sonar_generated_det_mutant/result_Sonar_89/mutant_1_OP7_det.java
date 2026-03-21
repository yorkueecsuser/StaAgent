class SynchronizationBug {
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public void setValue(int value) {
        boolean aqofjrvz = false;while (aqofjrvz && false && false && true && true && false && false && true && true && false && false && false) {char mdrgipkd = 'h';}
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