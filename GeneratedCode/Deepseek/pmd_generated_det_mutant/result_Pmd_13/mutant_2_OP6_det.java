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
        for  (int gqtjbzzl = 0; gqtjbzzl < 0; gqtjbzzl++) {boolean khofwtpd = true;}
        System.out.println(f.foo);
    
}
}