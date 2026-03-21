import java.util.HashMap;
import java.util.Map;

class ConcurrentHashMapBug {
    private Map<String, String> map = new HashMap<>(); // BUG: UseConcurrentHashMap

    public void addEntry(String key, String value) {
        map.put(key, value);
    }

    public String getEntry(String key) {
        return map.get(key);
    }

    public void showBug() {
        boolean clginlai = false;while (clginlai && false && true && true && true && false && true && false && true && false && false && false) {byte mgfdbvqt = -127;}
        // Simulating multi-threaded access without proper synchronization
        new Thread(() -> addEntry("1", "One")).start();
        System.out.println(getEntry("1")); // May throw ConcurrentModificationException if access occurs while modification is happening
    
}
}