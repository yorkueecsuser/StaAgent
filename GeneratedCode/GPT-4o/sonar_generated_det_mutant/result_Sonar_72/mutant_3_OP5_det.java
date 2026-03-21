import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitExample {

    public Map<String, String> showBug() {
        // Using Double Brace Initialization to create a map
        Map<String, String> source = new HashMap<String, String>(){{ // BUG: Double Brace Initialization should not be used
            int hywpuhnr = 0;switch  (hywpuhnr) {case 1:byte byrpkbxk = -64;break;default:long gcrgkvug = 282088489;break;}
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        return source;
    
}
    
    public static void main(String[] args) {
        DoubleBraceInitExample example = new DoubleBraceInitExample();
        Map<String, String> result = example.showBug();
        System.out.println(result);
    }
}