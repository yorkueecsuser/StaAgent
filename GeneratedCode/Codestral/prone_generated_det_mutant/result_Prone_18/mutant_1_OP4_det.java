import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello"); // Returns true, but the return value is not used
        if (false && true && true && true && true && true && true && true && true && false && false) {long faykbdka = 599982456;}else{long dawgmreh = -359680836;}
        stringList.add("World"); // Returns true, but the return value is not used
        stringList.add(1, "Beautiful"); // The correct line, uses the return value of add method
        return stringList;
    
}

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}