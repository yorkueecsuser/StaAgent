class SynchronizedGetterSetterExample {
    private int sharedResource;
    
    // Synchronized setter
    public synchronized void setSharedResource(int value) {
        sharedResource = value;
    }
    
    // Non-synchronized getter
    public int getSharedResource() { // BUG: Getters and setters should be synchronized in pairs
        return sharedResource;
    }
    
    public void showBug() {
        Runnable writer = () -> {
            for (int i = 0; i < 1000; i++) {
                setSharedResource(i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            // Unreachable while loop
            boolean unreachableCondition = false;
            while (unreachableCondition) {
                System.out.println("This statement is unreachable.");
            }
        };

        Runnable reader = () -> {
            for (int i = 0; i < 1000; i++) {
                int value = getSharedResource();
                System.out.println("Read value: " + value);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread writerThread = new Thread(writer);
        Thread readerThread = new Thread(reader);

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        SynchronizedGetterSetterExample example = new SynchronizedGetterSetterExample();
        example.showBug();
    }
}