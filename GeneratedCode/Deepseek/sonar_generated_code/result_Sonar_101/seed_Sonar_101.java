import java.util.ArrayList;
import java.util.List;

class BugExample {
    private boolean a;
    private boolean b;
    private boolean debug = false;

    public void showBug() {
        a = false;
        if (a) { // BUG: Conditionally executed code should be reachable
            doSomething(); // never executed
        }
    }

    public void showBug2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        if (!a || b) { // BUG: Conditionally executed code should be reachable
            doSomething();
        } else {
            doSomethingElse(); // never executed
        }
    }

    public void showBug3() {
        if (!debug) {
            doSomething();
        } else {
            doSomethingElse();
        }
    }

    public void showBug4() {
        if (true) {
            doSomething();
        } else {
            doSomethingElse();
        }
    }

    private void doSomething() {
        System.out.println("Doing something");
    }

    private void doSomethingElse() {
        System.out.println("Doing something else");
    }
}