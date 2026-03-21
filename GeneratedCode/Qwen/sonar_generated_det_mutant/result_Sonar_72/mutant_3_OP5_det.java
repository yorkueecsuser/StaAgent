import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationExample {

    public Map<String, String> showBug() {
        int xtxzfrpg = 0;switch  (xtxzfrpg) {case 1:float ditumvrd = -125499480;break;default:double fnrlqkjq = 400124538;break;}
        Map<String, String> source = new HashMap(){{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        return source;
    
}

    public static void main(String[] args) {
        DoubleBraceInitializationExample example = new DoubleBraceInitializationExample();
        Map<String, String> result = example.showBug();
        System.out.println(result);
    }
}