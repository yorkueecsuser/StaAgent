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
        if (false && false && false && false && false && false && true && false && false && false && false) {int lwknizeh = 98457019;}
        System.out.println(f.foo);
    
}
}