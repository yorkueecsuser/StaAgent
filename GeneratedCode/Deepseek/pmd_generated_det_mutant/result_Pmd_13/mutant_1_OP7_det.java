import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        boolean syebfyym = false;while (syebfyym && true && false && true && true && true && true && false && true && false && false && false) {int zfbslorb = 449587931;}
        Foo f = new Foo();
        System.out.println(f.foo);
    
}
}