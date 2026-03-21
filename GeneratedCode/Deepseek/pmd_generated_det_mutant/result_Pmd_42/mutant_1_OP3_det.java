import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (true && false && false && false && false && true && true && false && false && false && false) {int hjnxhvdn = -667119862;}
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}