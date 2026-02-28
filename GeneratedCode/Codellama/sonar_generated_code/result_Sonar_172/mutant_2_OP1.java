import java.lang.System;

class FinalizeBug {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        myObject.showBug();
    }
}

class MyObject {
    public void showBug() {
        System.out.println("Buggy code execution");
    }

    protected void finalize() {
        releaseSomeResources(); // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    }

    private void releaseSomeResources() {
        System.out.println("Release some resources");
    }
}

// Dead Store Mutant:
class MyObject {
    public void showBug() {
        System.out.println("Buggy code execution");
    }

    protected void finalize() {
        releaseSomeResources(); // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    }

    private void releaseSomeResources() {
        System.out.println("Release some resources");
    }

    private void dummyMethod() {
        int x = 0;
        System.out.println("Dead store: x = " + x);
    }
}