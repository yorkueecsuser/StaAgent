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
    }

    public static void main(String[] args) {
        SynchronizedGetterSetterExample example = new SynchronizedGetterSetterExample();
        example.showBug();
    }
}

// Mutant code
class SynchronizedGetterSetterExample_mutant {
    private int a; // Renamed sharedResource to a

    // Synchronized setter
    public synchronized void setA(int b) { // Renamed sharedResource to a and value to b
        a = b;
    }

    // Non-synchronized getter
    public int getA() { // Renamed sharedResource to a
        return a;
    }

    public void showBug_mutant() {
        Runnable writer = () -> {
            for (int i = 0; i < 1000; i++) {
                setA(i); // Renamed setSharedResource to setA
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable reader = () -> {
            for (int i = 0; i < 1000; i++) {
                int value = getA(); // Renamed getSharedResource to getA
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
        SynchronizedGetterSetterExample_mutant example_mutant = new SynchronizedGetterSetterExample_mutant();
        example_mutant.showBug_mutant();
    }
}