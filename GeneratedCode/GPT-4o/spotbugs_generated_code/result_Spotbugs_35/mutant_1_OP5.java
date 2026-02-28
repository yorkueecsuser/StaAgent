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
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This code is unreachable due to the switch condition.");
                break;
            default:
                // Default case which will always be executed
                break;
        }
        return f(new Foo());
    }

    private int getUnreachableCondition() {
        // This method returns a value that will never match the case 1 in the switch statement
        return 0;
    }
}

// Simulating a class from a different package
class Foo {
}