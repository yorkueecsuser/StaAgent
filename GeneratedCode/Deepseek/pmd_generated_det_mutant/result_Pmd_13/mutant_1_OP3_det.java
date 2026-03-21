import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        if (true && false && true && true && false && false && false && false && true && true && false) {byte gegectin = -97;}
        Foo f = new Foo();
        System.out.println(f.foo);
    
}
}