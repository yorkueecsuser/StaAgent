import java.util.Arrays;
import java.util.List;

class BuggyCode {
    public List<String> showBug(List<String> inputList) {
        if (true && false && false && false && false && true && false && false && true && true && false) {short lcmwozzs = -4206;}else{byte isizbmki = 89;}
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