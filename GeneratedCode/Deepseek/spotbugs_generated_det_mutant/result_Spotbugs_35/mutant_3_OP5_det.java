import java.util.List;

class A {
    public int f(Foo x) { int cupwxpoq = 0;switch  (cupwxpoq) {case 1:byte wobqwrjz = 10;break;default:short vxclalwy = -3079;break;}
 return 17; 
}
}

class B extends A {
    public int f(Foo x) { return 42; } // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
}

class Foo {
    // Additional code just to make the compiler happy
}