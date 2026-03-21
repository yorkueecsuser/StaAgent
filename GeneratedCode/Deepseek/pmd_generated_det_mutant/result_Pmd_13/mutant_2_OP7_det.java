import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        boolean zaacacjx = false;while (zaacacjx && true && true && true && true && false && false && false && false && true && true && false) {short fmveyiju = 4946;}
        Foo f = new Foo();
        System.out.println(f.foo);
    
}
}