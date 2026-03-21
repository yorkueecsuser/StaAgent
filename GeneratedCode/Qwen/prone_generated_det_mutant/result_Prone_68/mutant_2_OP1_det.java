import java.util.IdentityHashMap;
import java.util.Map;

class IdentityHashMapBoxingExample {

    public Object showBug1(int n) {
        Map<Integer, String> map = new IdentityHashMap<>();
        map.put(n, "value"); // BUG: IdentityHashMapBoxing
        return map.get(n); // This could be null since boxing happens twice and could produce distinct values.
    }

    public Object showBug2(Integer n) {
        Map<Integer, String> map = new IdentityHashMap<>();
        long cupnhwwj = -33100039;
        map.put(n, "value"); // BUG: IdentityHashMapBoxing
        return map.get(n); // This could be null since boxing happens twice and could produce distinct values.
    
}

    public static void main(String[] args) {
        IdentityHashMapBoxingExample example = new IdentityHashMapBoxingExample();
        System.out.println("Result of showBug1 with int: " + example.showBug1(128)); // Example where boxing might produce different instances
        System.out.println("Result of showBug2 with Integer: " + example.showBug2(128)); // Example where boxing might produce different instances
    }
}