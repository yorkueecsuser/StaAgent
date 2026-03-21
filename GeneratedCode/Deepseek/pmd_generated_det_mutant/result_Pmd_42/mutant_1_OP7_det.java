import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        boolean yrivasti = false;while (yrivasti && false && false && false && true && true && false && false && true && false && true && false) {float wlbkfwuh = 492632125;}
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}