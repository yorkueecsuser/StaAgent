import java.util.ArrayList;
import java.util.List;

class BugExample {
    public String method1() { return "ok";}
    public String method2() { return null;}

    public void method(String a) {
        String b = "";
        String deadStore1 = "deadStore"; // dead store mutation
        if (a!= null && method1().equals(a)) { // will trigger the rule
            //whatever
        }

        String deadStore2 = "deadStore"; // dead store mutation
        if (method1().equals(a) && a!= null) { // won't trigger the rule
            //whatever
        }

        String deadStore3 = "deadStore"; // dead store mutation
        if (a!= null && b!= null && method1().equals(b)) { // won't trigger the rule
            //whatever
        }

        String deadStore4 = "deadStore"; // dead store mutation
        if (a!= null && "LITERAL".equals(a)) { // won't trigger the rule
            //whatever
        }

        String deadStore5 = "deadStore"; // dead store mutation
        if (a!= null &&!a.equals("go")) { // won't trigger the rule
            a = method2();
            if (method1().equals(a)) {
                //whatever
            }
        }
    }

    public boolean showBug() {
        method("test");
        return true;
    }
}