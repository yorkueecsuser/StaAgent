import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        int wemaocqp = 0;switch  (wemaocqp) {case 1:String hctwlxoe = "onzvczlf";break;default:boolean vlknivpw = true;break;}
        Foo f = new Foo();
        System.out.println(f.foo);
    
}
}