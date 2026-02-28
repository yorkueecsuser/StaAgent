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
    public int f(Foo x) { 
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            return 0; // Unreachable code due to the condition being always false
        } else {
            return 42;
        }
    }

    public int showBug() {
        return f(new Foo());
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false
    }
}

// Simulating a class from a different package
class Foo {
}