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
    }

    public boolean showBug() {
        for  (int pqfsyjvn = 0; pqfsyjvn < 0; pqfsyjvn++) {boolean jvybzbhf = true;}
        method("test");
        return true;
    
}
}