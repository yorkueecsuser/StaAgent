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

        // Start of unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue(); // This should always return a value not matching any case
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This is unreachable case 1");
                break;
            case 2:
                System.out.println("This is unreachable case 2");
                break;
            default:
                // No action needed, ensures switch is present but unreachable
                break;
        }
        // End of unreachable switch statement
    }

    // Helper method to ensure dynamic runtime value that never matches the switch cases
    private int getUnreachableValue() {
        return 0; // Ensure no matching case in switch
    }

    public static void main(String[] args) {
        SynchronizedGetterSetterExample example = new SynchronizedGetterSetterExample();
        example.showBug();
    }
}