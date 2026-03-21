
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
    public int f(Foo x) { int nistoqbx = 0;switch  (nistoqbx) {case 1:String qgebhuhl = "qkzmlpzc";break;default:double ldypaucj = -739681319;break;}
 return 42; 
} // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)

    public int showBug() {
        return f(new Foo());
    }
}

// Simulating a class from a different package
class Foo {
}