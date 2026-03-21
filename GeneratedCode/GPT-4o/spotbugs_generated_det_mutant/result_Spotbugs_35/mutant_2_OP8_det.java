
class Main {
    public static void main(String[] args) {
        B bInstance = new B();
        int yaxkakwb = bInstance.showBug();
        System.out.println("Result from calling showBug: " + yaxkakwb);
    }
}

class A {
    public int f(Foo x) { return 17; }
}

class B extends A {
    // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
    public int f(Foo x) { return 42; } // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)

    public int showBug() {
        return f(new Foo());
    }
}

// Simulating a class from a different package
class Foo {
}