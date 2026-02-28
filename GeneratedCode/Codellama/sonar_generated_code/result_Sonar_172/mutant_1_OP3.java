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

// Mutant 1: Unreachable if statement
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

    // Unreachable if statement
    public void showBug() {
        if (false) {
            System.out.println("This code is unreachable");
        }
        System.out.println("Buggy code execution");
    }
}

// Mutant 2: Unreachable while loop
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

    // Unreachable while loop
    public void showBug() {
        while (false) {
            System.out.println("This code is unreachable");
        }
        System.out.println("Buggy code execution");
    }
}

// Mutant 3: Unreachable for loop
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

    // Unreachable for loop
    public void showBug() {
        for (int i = 0; false; i++) {
            System.out.println("This code is unreachable");
        }
        System.out.println("Buggy code execution");
    }
}

// Mutant 4: Unreachable if-else statement
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

    // Unreachable if-else statement
    public void showBug() {
        if (false) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is also unreachable");
        }
        System.out.println("Buggy code execution");
    }
}

// Mutant 5: Unreachable switch statement
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
    public void showBug() {
        switch (0) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is also unreachable");
                break;
        }
        System.out.println("Buggy code execution");
    }
}