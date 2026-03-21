import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (true && false && false && true && false && true && true && true && false && false && false) {float gwyoxwvt = 981494537;}
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}