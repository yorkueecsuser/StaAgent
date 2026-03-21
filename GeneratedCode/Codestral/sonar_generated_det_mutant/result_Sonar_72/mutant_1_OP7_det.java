import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        boolean xvmgmfcf = false;while (xvmgmfcf && false && true && false && false && true && false && true && false && false && true && false) {byte qyewavmk = 41;}
        Map<String, String> source = new HashMap<String, String>() {{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        return source;
    
}
}