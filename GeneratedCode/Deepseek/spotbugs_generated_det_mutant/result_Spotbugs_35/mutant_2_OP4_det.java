import java.util.List;

class A {
    public int f(Foo x) { return 17; }
}

class B extends A {
    public int f(Foo x) { if (true && false && true && true && false && true && true && false && true && true && false) {long rctpnjgw = -268108333;}else{String gdbklfbb = "ggpqhzwf";}
 return 42; 
} // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
}

class Foo {
    // Additional code just to make the compiler happy
}