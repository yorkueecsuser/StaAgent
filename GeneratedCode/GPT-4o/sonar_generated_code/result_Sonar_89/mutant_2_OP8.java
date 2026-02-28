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

// Mutant code based on Renaming mutation operator
class SynchronizedGetterSetterExampleMutant {
    private int a; // renamed from sharedResource
    
    // Synchronized setter
    public synchronized void setA(int value) { // renamed from setSharedResource
        a = value;
    }
    
    // Non-synchronized getter
    public int getA() { // renamed from getSharedResource
        return a;
    }
    
    public void showBugMutant() { // renamed from showBug
        Runnable writerMutant = () -> { // renamed from writer
            for (int i = 0; i < 1000; i++) {
                setA(i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable readerMutant = () -> { // renamed from reader
            for (int i = 0; i < 1000; i++) {
                int value = getA();
                System.out.println("Read value from mutant: " + value);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread writerThreadMutant = new Thread(writerMutant); // renamed from writerThread
        Thread readerThreadMutant = new Thread(readerMutant); // renamed from readerThread

        writerThreadMutant.start();
        readerThreadMutant.start();

        try {
            writerThreadMutant.join();
            readerThreadMutant.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        SynchronizedGetterSetterExampleMutant exampleMutant = new SynchronizedGetterSetterExampleMutant();
        exampleMutant.showBugMutant();
    }
}