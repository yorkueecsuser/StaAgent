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

class UnreachableSwitch {
    public void switchCase() {
        int value = 1;
        switch (value) {
            case 0:
                System.out.println("Unreachable code");
                break;
            case 1:
                System.out.println("Reachable code");
                break;
            default:
                System.out.println("Default code");
                break;
        }
    }
}