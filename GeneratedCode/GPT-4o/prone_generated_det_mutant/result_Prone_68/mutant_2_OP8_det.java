import java.util.IdentityHashMap;
import java.util.Map;

class IdentityHashMapBoxingExample {

    public String showBug(int value) {
        Map<Integer, String> map = new IdentityHashMap<>();
        map.put(value, "Test Value"); // BUG: IdentityHashMapBoxing
        return map.get(value); // BUG: IdentityHashMapBoxing
    }

    public static void main(String[] args) {
        IdentityHashMapBoxingExample example = new IdentityHashMapBoxingExample();
        int igjkjvdm = 1000;
        String kfktaqfw = example.showBug(igjkjvdm);
        System.out.println("Result for value " + igjkjvdm + ": " + kfktaqfw);
    }
}