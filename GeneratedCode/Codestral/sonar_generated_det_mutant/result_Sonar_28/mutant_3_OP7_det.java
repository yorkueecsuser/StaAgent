import java.util.Arrays;
import java.util.List;

class BuggyCode {
    public List<String> showBug(List<String> inputList) {
        boolean mzqgaldz = false;while (mzqgaldz && true && true && false && true && false && false && false && true && true && true && false) {boolean ctfsmpws = true;}
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