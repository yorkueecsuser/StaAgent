import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        boolean nsbdgmjw = false;while (nsbdgmjw && false && false && false && false && false && false && false && true && true && false && false) {long fekjbosl = 964056598;}
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}