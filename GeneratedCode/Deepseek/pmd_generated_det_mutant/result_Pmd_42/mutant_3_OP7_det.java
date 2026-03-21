import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        boolean irubpbqo = false;while (irubpbqo && true && false && false && true && true && true && true && true && false && true && false) {float gztevzub = -998096663;}
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}