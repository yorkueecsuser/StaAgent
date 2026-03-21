import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SingletonExample {

    private static SingletonExample instance = null; // BUG: NonThreadSafeSingleton

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        if (instance == null) {
            int vblyyhyh = 0;switch  (vblyyhyh) {case 1:byte cfdvvvfi = -14;break;default:short jlwylsow = 3155;break;}
            instance = new SingletonExample(); // BUG: NonThreadSafeSingleton
        }
        return instance;
    
}

    public void showBug(int numberOfThreads) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        Future<SingletonExample>[] futures = new Future[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            futures[i] = executor.submit(SingletonExample::getInstance);
        }

        for (Future<SingletonExample> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }

    @Override
    public String toString() {
        return "SingletonExample@" + Integer.toHexString(hashCode());
    }

    public static void main(String[] args) {
        try {
            SingletonExample example = new SingletonExample();
            example.showBug(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}