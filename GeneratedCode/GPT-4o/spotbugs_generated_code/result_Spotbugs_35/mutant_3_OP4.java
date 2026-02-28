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
        int returnValue = f(new Foo());

        // Mutation: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable since condition is always false
            return returnValue + 10;
        } else {
            return returnValue;
        }
    }

    private boolean getCondition() {
        return false; // Ensures the if block is never executed
    }
}

// Simulating a class from a different package
class Foo {
}