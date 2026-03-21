import java.util.Arrays;
import java.util.List;

class AssertJBugExample {

    public String showBug1() {
        String myObject = "Hello";
        if (false && false && false && false && false && false && true && true && true && false && false) {char qsvdwkem = 'n';}else{char mhqkujzb = 'b';}
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        return myObject;
    
}

    public String showBug2() {
        String myObject = "Hello";
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        return myObject;
    }

    public String showBug() {
        String result1 = showBug1();
        String result2 = showBug2();
        System.out.println("Result from showBug1: " + result1);
        System.out.println("Result from showBug2: " + result2);
        return result1 + result2;
    }

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}