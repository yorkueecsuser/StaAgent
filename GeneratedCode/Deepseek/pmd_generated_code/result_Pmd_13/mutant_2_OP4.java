import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
    boolean condition = true;
    boolean conditionWhile = false;
    boolean conditionFor = true;
    boolean shouldRun = true;
    int value = 0;
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        if (f.condition) {
            System.out.println(f.foo);
        } else {
            System.out.println("This is unreachable code");
        }

        while (f.conditionWhile) {
            System.out.println("This is unreachable code");
        }

        for (int i = 0; f.conditionFor; i++) {
            System.out.println("This is unreachable code");
        }

        if (f.shouldRun) {
            System.out.println(f.foo);
        } else {
            System.out.println("This is unreachable code");
        }
        
        switch (f.value) {
            case 1:
                System.out.println(f.foo);
                break;
            default:
                System.out.println("This is unreachable code");
        }
    }
}