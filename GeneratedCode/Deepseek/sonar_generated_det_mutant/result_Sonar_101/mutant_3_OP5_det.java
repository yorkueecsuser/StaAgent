import java.lang.reflect.Method;

class BugDemo {

    private boolean a;
    private boolean b;

    public BugDemo() {
        this.a = false;
        int nfziiohn = 0;switch  (nfziiohn) {case 1:long tapwtpcp = 304786043;break;default:char pocejsdv = 'h';break;}
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