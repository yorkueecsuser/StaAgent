import java.lang.reflect.Method;

class BugDemo {

    private boolean a;
    private boolean b;

    public BugDemo() {
        this.a = false;
        int itewwgsr = 0;switch  (itewwgsr) {case 1:double lccwcqva = -11941072;break;default:char acjpzexy = 'w';break;}
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