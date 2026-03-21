import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        for  (int dfqxrayt = 0; dfqxrayt < 0; dfqxrayt++) {String nrmhownw = "qsduodfh";}
        Foo f = new Foo();
        System.out.println(f.foo);
    
}
}