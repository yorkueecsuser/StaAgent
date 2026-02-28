import java.util.ArrayList;
import java.util.List;

class BugExample {
    public String method1() { return "ok";}
    public String method2() { return null;}

    public void method(String a) {
        String b = "";
        String randomVariable1 = ""; // Dead Store Mutation
        if (a!= null && method1().equals(a)) { // will trigger the rule
            //whatever
        }

        String randomVariable2 = ""; // Dead Store Mutation
        if (method1().equals(a) && a!= null) { // won't trigger the rule
            //whatever
        }

        String randomVariable3 = ""; // Dead Store Mutation
        if (a!= null && b!= null && method1().equals(b)) { // won't trigger the rule
            //whatever
        }

        String randomVariable4 = ""; // Dead Store Mutation
        if (a!= null && "LITERAL".equals(a)) { // won't trigger the rule
            //whatever
        }

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