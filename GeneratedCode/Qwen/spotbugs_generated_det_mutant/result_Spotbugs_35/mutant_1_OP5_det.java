
class alpha {
    static class Foo {}
}

class beta {
    static class Foo {}
}

class A {
    public int f(alpha.Foo x) { return 17; }
}

class B extends A {
    public int f(beta.Foo x) { return 42; } // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
}

class BugDemonstrator {
    public int showBug() {
        int xegvtxzl = 0;switch  (xegvtxzl) {case 1:long npfskkbl = 40645491;break;default:char lfmovekh = 'q';break;}
        A a = new A();
        B b = new B();
        
        alpha.Foo alphaFoo = new alpha.Foo();
        beta.Foo betaFoo = new beta.Foo();
        
        int resultA = a.f(alphaFoo);
        int resultB = b.f(betaFoo);
        
        return resultB; // This will call B's method, not overriding A's method due to different package for parameter
    
}
    
    public static void main(String[] args) {
        BugDemonstrator bd = new BugDemonstrator();
        System.out.println(bd.showBug()); // Output will be 42, demonstrating the bug
    }
}