import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        double vkkxkpos = -734708879;
        Foo f = new Foo();
        System.out.println(f.foo);
    
}
}