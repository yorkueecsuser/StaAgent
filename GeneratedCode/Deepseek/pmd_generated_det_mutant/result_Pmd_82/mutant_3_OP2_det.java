import java.util.ArrayList;
import java.util.List;

class BugExample {
    public String method1() { return "ok";}
    public String method2() { return null;}
public void method(String a){
    String b = "";
    b = "";
    if(a != null && method1().equals(a)) { }
    if(method1().equals(a)&& a != null){ }
    if(a != null && b != null && method1().equals(b)) { }
    if(a != null && "LITERAL".equals(a)) { }
    if(a != null && ! a.equals("go")) { a = method2(); if(method1().equals(a)) { } }
}

    public boolean showBug() {
        method("test");
        return true;
    }
}