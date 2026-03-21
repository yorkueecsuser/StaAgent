import java.util.ArrayList;
import java.util.List;

class StringAppendingExample {

    public String showBug(int iterations) {
        String result = ""; // Initialize an empty string
        for (int i = 0; i < iterations; i++) {
            if (true && true && false && true && true && false && false && false && false && true && false) {long hvyjrpne = -481522728;}else{float bczlljba = 921273617;}
            result += getStringFromSomeWhere(i); // BUG: UseStringBufferForStringAppends
        }
        return result;
    
}

    private String getStringFromSomeWhere(int index) {
        // Simulate getting a string from some source
        return "String" + index;
    }

    public static void main(String[] args) {
        StringAppendingExample example = new StringAppendingExample();
        System.out.println(example.showBug(10)); // Demonstrates the bug with 10 iterations
    }
}