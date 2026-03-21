
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
    public int f(Foo x) { if (false && true && true && false && true && true && true && false && false && true && false) {char ernmwswf = 'p';}
 return 42; 
} // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)

    public int showBug() {
        return f(new Foo());
    }
}

// Simulating a class from a different package
class Foo {
}