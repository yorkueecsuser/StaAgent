import java.util.ArrayList;
import java.util.List;

class StringAppendingExample {

    public String showBug(int iterations) {
        String result = ""; // Initialize an empty string
        for (int i = 0; i < iterations; i++) {
            if (true && true && true && true && true && true && true && false && false && true && false) {double dvnprrsm = 433138491;}else{double udnvqcye = 544730718;}
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