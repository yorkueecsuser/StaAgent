import java.util.HashMap;
import java.util.Map;

class MultiThreadedMapExample {

    private Map<String, Integer> map;

    public MultiThreadedMapExample() {
        // Using a HashMap in a multi-threaded context is a bug here
        map = new HashMap<>(); // BUG: UseConcurrentHashMap
    }

    public synchronized void incrementValue(String key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    public synchronized Integer getValue(String key) {
        return map.get(key);
    }

    public void showBug(String[] zgbhqxags) {
        Thread[] threads = new Thread[zgbhqxags.length];
        for (int i = 0; i < zgbhqxags.length; i++) {
            final String zgbhqxag = zgbhqxags[i];
            threads[i] = new Thread(() -> incrementValue(zgbhqxag));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (String zgbhqxag : zgbhqxags) {
            System.out.println("Key: " + zgbhqxag + ", Value: " + getValue(zgbhqxag));
        }
    }

    public static void main(String[] args) {
        MultiThreadedMapExample example = new MultiThreadedMapExample();
        example.showBug(new String[]{"apple", "banana", "apple", "orange", "banana", "apple"});
    }
}