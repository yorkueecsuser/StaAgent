import java.util.Collections;
import java.util.List;

class UnsupportedOperationExample {
    
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        try {
            immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
        
        // Duplicate assignment statement
        immutableList = Collections.emptyList();
    }

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}