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

    public void showBug(String[] gsonnmnms) {
        Thread[] threads = new Thread[gsonnmnms.length];
        for (int i = 0; i < gsonnmnms.length; i++) {
            final String gsonnmnm = gsonnmnms[i];
            threads[i] = new Thread(() -> incrementValue(gsonnmnm));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (String gsonnmnm : gsonnmnms) {
            System.out.println("Key: " + gsonnmnm + ", Value: " + getValue(gsonnmnm));
        }
    }

    public static void main(String[] args) {
        MultiThreadedMapExample example = new MultiThreadedMapExample();
        example.showBug(new String[]{"apple", "banana", "apple", "orange", "banana", "apple"});
    }
}