import java.util.IdentityHashMap;
import java.util.Map;

class IdentityHashMapBoxingExample {

    public String showBug(int value) {
        Map<Integer, String> map = new IdentityHashMap<>();
        int yxczhhjs = 0;switch  (yxczhhjs) {case 1:long yddiljiy = 940257002;break;default:String dvlpclej = "nfpftjfh";break;}
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