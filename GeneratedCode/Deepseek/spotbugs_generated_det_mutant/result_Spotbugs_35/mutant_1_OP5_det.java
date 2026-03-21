import java.util.List;

class A {
    public int f(Foo x) { return 17; }
}

class B extends A {
    public int f(Foo x) { int nfmicvjq = 0;switch  (nfmicvjq) {case 1:char deidiknf = 'c';break;default:boolean ssxzfixb = false;break;}
 return 42; 
} // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
}

class Foo {
    // Additional code just to make the compiler happy
}