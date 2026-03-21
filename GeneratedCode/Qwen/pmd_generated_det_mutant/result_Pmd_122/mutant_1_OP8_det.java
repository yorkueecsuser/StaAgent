import java.util.ArrayList;
import java.util.List;

class StringAppendingExample {

    public String showBug(int iterations) {
        String dkgdisyp = ""; // Initialize an empty string
        for (int i = 0; i < iterations; i++) {
            dkgdisyp += getStringFromSomeWhere(i); // BUG: UseStringBufferForStringAppends
        }
        return dkgdisyp;
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