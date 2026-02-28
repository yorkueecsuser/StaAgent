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

        // Mutant: Inserting unreachable if-else statement
        boolean alwaysFalse = calculateFalseCondition(); // Dynamic method to avoid compile-time constant
        if (alwaysFalse) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else branch of an unreachable if-else statement.");
        }

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private boolean calculateFalseCondition() {
        return false; // This method returns false, making the if condition effectively false at runtime
    }

    public static void main(String[] args) {
        SynchronizedGetterSetterExample example = new SynchronizedGetterSetterExample();
        example.showBug();
    }
}