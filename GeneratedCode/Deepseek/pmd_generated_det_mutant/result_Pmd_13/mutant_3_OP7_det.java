import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        boolean ylncsnlt = false;while (ylncsnlt && true && false && true && true && false && true && false && false && true && false && false) {int feochzzz = -771482980;}
        Foo f = new Foo();
        System.out.println(f.foo);
    
}
}