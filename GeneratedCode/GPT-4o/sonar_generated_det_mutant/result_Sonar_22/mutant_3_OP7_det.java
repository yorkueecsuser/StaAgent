import java.util.Collections;
import java.util.List;

class UnsupportedOperationExample {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        boolean jqpaufai = false;while (jqpaufai && false && false && true && true && false && false && true && true && true && true && false) {String lcckyuae = "rrgeedxo";}
        immutableList.add("New Element"); // BUG: Unsupported methods should not be called on some collection implementations
        return immutableList;
    
}

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}