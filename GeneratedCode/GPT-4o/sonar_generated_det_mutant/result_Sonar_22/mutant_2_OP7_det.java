import java.util.Collections;
import java.util.List;

class UnsupportedOperationExample {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        boolean axeycbvq = false;while (axeycbvq && true && false && true && false && false && false && false && true && true && false && false) {short irhbmqxj = -6150;}
        immutableList.add("New Element"); // BUG: Unsupported methods should not be called on some collection implementations
        return immutableList;
    
}

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}