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
        int mrwnjiuy = 0;switch  (mrwnjiuy) {case 1:char cqvzrfum = 'v';break;default:int hhhfsauj = 502407978;break;}
        System.out.println(f.foo);
    
}
}