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
    // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
    public int f(Foo x) { return 42; } // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)

    public int showBug() {
        // Mutation Operator: Unreachable if-else statement
        boolean unreachableCondition = getCondition(); // Using a method to get condition to avoid compile-time constant
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
            return -1;
        } else {
            return f(new Foo());
        }
    }

    private boolean getCondition() {
        return false; // Always returns false, making the if branch unreachable
    }
}

// Simulating a class from a different package
class Foo {
}