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

    // Unreachable switch statement
    private void unreachableSwitch(int value) {
        switch(value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This is the default case");
                break;
        }
    }
}