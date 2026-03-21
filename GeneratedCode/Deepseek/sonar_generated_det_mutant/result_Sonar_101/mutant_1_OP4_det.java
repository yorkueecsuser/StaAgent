import java.lang.reflect.Method;

class BugDemo {

    private boolean a;
    private boolean b;

    public BugDemo() {
        this.a = false;
        if (false && true && false && false && true && false && true && false && true && false && false) {char vyyymjkg = 'n';}else{byte sdwtszas = 3;}
        this.b = true;
    
}

    // BUG: Conditionally executed code should be reachable
    public void showBug() {
        if (a) { // Noncompliant
            doSomething(); // never executed
        }

        if (!a || b) { // Noncompliant; "!a" is always "true", "b" is never evaluated
            doSomething();
        } else {
            doSomethingElse(); // never executed
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }

    private void doSomethingElse() {
        System.out.println("Doing something else...");
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}