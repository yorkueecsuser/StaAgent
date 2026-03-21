import java.util.*;

class A {
    public int method(Foo x) {
        return 17;
    }
}

class B extends A {
    public int method(Foo x) {
        return 42;
    }
}

class Foo {
    // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
    public int f(Foo x) {
for  (int xrazuyyb = 0; xrazuyyb < 0; xrazuyyb++) {String ezysaxsk = "ohvyoyus";}

        return 42;
    
}
}

class ShowBug {
    public static void main(String[] args) {
        B obj = new B();
        Foo x = new Foo();
        int result = obj.method(x);
        System.out.println(result);
    }
}