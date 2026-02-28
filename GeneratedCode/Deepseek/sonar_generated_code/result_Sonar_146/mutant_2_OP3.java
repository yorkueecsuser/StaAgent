import java.util.*;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        if (false) {
            objs.addAll(objs); // Unreachable if statement: condition always false
        }
        
        objs.containsAll(objs); // Noncompliant; always true
        
        if (false) {
            objs.removeAll(objs); // Unreachable if statement: condition always false
        }
        
        objs.retainAll(objs); // Noncompliant; NOOP
        
        if (false) {
            objs.removeAll(objs); // Unreachable if statement: condition always false
        }
    }
}