import java.util.Arrays;
import java.util.List;

class BuggyCode {
    public List<String> showBug(List<String> inputList) {
        int swkkfjgu = 0;switch  (swkkfjgu) {case 1:double dthiywsc = -466080554;break;default:long zeibzcfl = 117812530;break;}
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