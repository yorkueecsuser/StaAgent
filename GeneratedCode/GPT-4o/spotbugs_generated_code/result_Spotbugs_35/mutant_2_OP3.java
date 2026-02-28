class Main {
    public static void main(String[] args) {
        B bInstance = new B();
        int result = bInstance.showBug();
        System.out.println("Result from calling showBug: " + result);
    }
}

class A {
    public int f(Foo x) { return 17; }
}

class B extends A {
    // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
    public int f(Foo x) { return 42; } // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)

    public int showBug() {
        if (isConditionMet()) { // Unreachable if statement
            System.out.println("This code is unreachable");
        }
        return f(new Foo());
    }
    
    private boolean isConditionMet() {
        return false; // This ensures the if statement is unreachable
    }
}

// Simulating a class from a different package
class Foo {
}