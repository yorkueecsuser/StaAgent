import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        for  (int hraxoggl = 0; hraxoggl < 0; hraxoggl++) {long zqgyrqox = 32046730;}
        Foo f = new Foo();
        System.out.println(f.foo);
    
}
}