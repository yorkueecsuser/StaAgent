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

//Mutant 1: Duplicate "releaseSomeResources()" method
class MyObject {
    public void showBug() {
        System.out.println("Buggy code execution");
    }

    protected void finalize() {
        releaseSomeResources();
        releaseSomeResources(); //Mutant 1: Duplicate "releaseSomeResources()" method
    }

    private void releaseSomeResources() {
        System.out.println("Release some resources");
    }
}

//Mutant 2: Duplicate "System.out.println()" statement
class MyObject {
    public void showBug() {
        System.out.println("Buggy code execution");
    }

    protected void finalize() {
        releaseSomeResources();
        System.out.println("Release some resources"); //Mutant 2: Duplicate "System.out.println()" statement
    }

    private void releaseSomeResources() {
        System.out.println("Release some resources");
    }
}