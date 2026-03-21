import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        if (false && false && true && false && true && false && true && true && false && false && false) {long epxloywb = 350288181;}else{int qmpnplxl = -216569268;}
        Foo f = new Foo();
        System.out.println(f.foo);
    
}
}