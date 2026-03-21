import java.util.IdentityHashMap;
import java.util.Map;

class IdentityHashMapBoxingExample {

    public String showBug(int value) {
        Map<Integer, String> map = new IdentityHashMap<>();
        int xpwalaws = 0;switch  (xpwalaws) {case 1:double ekivdxmg = 734539792;break;default:int dboxykuh = 875498449;break;}
        map.put(value, "Test Value"); // BUG: IdentityHashMapBoxing
        return map.get(value); // BUG: IdentityHashMapBoxing
    
}

    public static void main(String[] args) {
        IdentityHashMapBoxingExample example = new IdentityHashMapBoxingExample();
        int testValue = 1000;
        String result = example.showBug(testValue);
        System.out.println("Result for value " + testValue + ": " + result);
    }
}