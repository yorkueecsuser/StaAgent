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
        if (false && false && true && false && true && false && true && false && false && true && false) {long uaztrisx = 616790272;}else{String ulquncwy = "kjxmcnrf";}
        System.out.println(f.foo);
    
}
}