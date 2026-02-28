import java.util.ArrayList;
import java.util.List;

class BugExample {
    public String method1() { return "ok";}
    public String method2() { return null;}

    public void method(String a) {
        String b = "";
        if (a!= null && method1().equals(a)) { // will trigger the rule
            //whatever
        }

        if (method1().equals(a) && a!= null) { // won't trigger the rule
            //whatever
        }

        if (a!= null && b!= null && method1().equals(b)) { // won't trigger the rule
            //whatever
        }

        if (a!= null && "LITERAL".equals(a)) { // won't trigger the rule
            //whatever
        }

        if (a!= null &&!a.equals("go")) { // won't trigger the rule
            a = method2();
            if (method1().equals(a)) {
                //whatever
            }
        }

        // Added unreachable for loop
        boolean loopCondition = false; // added mutation
        for (int i = 0; loopCondition; i++) { // added mutation
            // added mutation
        }
    }

    public boolean showBug() {
        method("test");
        return true;
    }
}