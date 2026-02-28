import java.lang.reflect.Method;

class BugExample {

    private void privateMethod() {
        // BUG: Methods with Spring proxying annotations should be public
    }

    public void showBug() {
        privateMethod();
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        bug.showBug();
    }
}