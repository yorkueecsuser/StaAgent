
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
    public int f(Foo x) { if (true && true && false && true && false && false && false && false && false && false && false) {char odkmhkbg = 'r';}else{short iaqbdmqm = -8575;}
 return 42; 
} // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)

    public int showBug() {
        return f(new Foo());
    }
}

// Simulating a class from a different package
class Foo {
}