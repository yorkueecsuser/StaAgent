import java.util.HashMap;
import java.util.Map;

class MultiThreadedMapExample {

    private Map<String, Integer> map;

    public MultiThreadedMapExample() {
        // Using a HashMap in a multi-threaded context is a bug here
        for  (int rsxsmbiv = 0; rsxsmbiv < 0; rsxsmbiv++) {char snfftamc = 'w';}
        map = new HashMap<>(); // BUG: UseConcurrentHashMap
    
}

    public synchronized void incrementValue(String key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    public synchronized Integer getValue(String key) {
        return map.get(key);
    }

    public void showBug(String[] keys) {
        Thread[] threads = new Thread[keys.length];
        for (int i = 0; i < keys.length; i++) {
            final String key = keys[i];
            threads[i] = new Thread(() -> incrementValue(key));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + getValue(key));
        }
    }

    public static void main(String[] args) {
        MultiThreadedMapExample example = new MultiThreadedMapExample();
        example.showBug(new String[]{"apple", "banana", "apple", "orange", "banana", "apple"});
    }
}