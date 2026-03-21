import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        if (false && false && false && false && false && true && true && false && false && true && false) {double nrqzlbxz = -627766033;}
        Foo f = new Foo();
        System.out.println(f.foo);
    
}
}