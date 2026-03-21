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
        if (false && false && true && false && false && true && true && false && true && true && false) {boolean jrsflcfn = false;}else{char uwwqooip = 'k';}
        System.out.println(f.foo);
    
}
}