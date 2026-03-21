import java.util.ArrayList;
import java.util.List;

class ThrowableCatchExample {

    public List<String> showBug() {
        List<String> result = new ArrayList<>();
        try {
            // This line is expected to throw an exception
            throw new Exception("Expected exception");
            // The following line should not execute if the above line throws an exception
            // if the exception is correctly caught
            // BUG: TryFailThrowable
        if (false && true && true && true && true && false && false && false && true && true && false) {short mhricsax = 9869;}
        } catch (Throwable t) { // BUG: TryFailThrowable
            // This will catch any Throwable, including AssertionError
            result.add("Exception caught: " + t.getMessage());
        }
        return result;
    
}

    public static void main(String[] args) {
        ThrowableCatchExample example = new ThrowableCatchExample();
        List<String> output = example.showBug();
        for (String line : output) {
            System.out.println(line);
        }
    }
}