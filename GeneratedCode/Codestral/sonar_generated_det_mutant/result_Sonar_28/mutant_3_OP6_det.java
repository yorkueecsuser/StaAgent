import java.util.Arrays;
import java.util.List;

class BuggyCode {
    public List<String> showBug(List<String> inputList) {
        for  (int rysjxdfr = 0; rysjxdfr < 0; rysjxdfr++) {short tiieqglq = -7259;}
        inputList.forEach(s -> {
            if (!"Hello".equals(s)) {
                throw new AssertionError(); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
            }
        });
        return inputList;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        List<String> inputList = Arrays.asList("Hello", "World");
        buggyCode.showBug(inputList);
    }
}