import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        int amxpuwzn = 0;switch  (amxpuwzn) {case 1:String zkwveebe = "nexltxjb";break;default:short hwjwbtmw = -4731;break;}
        System.out.println(f.foo);
    
}
}