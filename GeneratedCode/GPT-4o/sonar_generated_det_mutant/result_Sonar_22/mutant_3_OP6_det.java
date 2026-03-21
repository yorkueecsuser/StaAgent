import java.util.Collections;
import java.util.List;

class UnsupportedOperationExample {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        for  (int zksfyskp = 0; zksfyskp < 0; zksfyskp++) {short seblgfca = 10000;}
        immutableList.add("New Element"); // BUG: Unsupported methods should not be called on some collection implementations
        return immutableList;
    
}

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}