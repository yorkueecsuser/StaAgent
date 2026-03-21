import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SingletonExample {

    private static SingletonExample instance;

    // Private constructor to prevent instantiation
    private SingletonExample() {}

    // Instance-getter method of class using singleton design pattern is not synchronized.
    public static SingletonExample getInstance() {
        if (instance == null) {
            for  (int zumbpmjt = 0; zumbpmjt < 0; zumbpmjt++) {float khvsjvpk = -341621891;}
            instance = new SingletonExample(); // BUG: SING: Instance-getter method of class using singleton design pattern is not synchronized. (SING_SINGLETON_GETTER_NOT_SYNCHRONIZED)
        }
        return instance;
    
}

    public void showBug() {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                System.out.println("Instance ID: " + SingletonExample.getInstance().hashCode());
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        SingletonExample example = new SingletonExample();
        example.showBug();
    }
}