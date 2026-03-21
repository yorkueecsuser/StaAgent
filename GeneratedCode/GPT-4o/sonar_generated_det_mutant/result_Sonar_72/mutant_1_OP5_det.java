import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitExample {

    public Map<String, String> showBug() {
        // Using Double Brace Initialization to create a map
        Map<String, String> source = new HashMap<String, String>(){{ // BUG: Double Brace Initialization should not be used
            int cgyebuzf = 0;switch  (cgyebuzf) {case 1:double zqiofzym = -867621865;break;default:int ahntayhx = 440670858;break;}
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