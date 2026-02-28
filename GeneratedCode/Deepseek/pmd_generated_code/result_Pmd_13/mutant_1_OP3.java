import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
    boolean ifStatementCondition = false; // mutant code
    if (ifStatementCondition) {
        System.out.println("Unreachable code");
    }
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
    boolean ifStatementCondition = false; // mutant code
    if (ifStatementCondition) {
        System.out.println("Unreachable code");
    }
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        System.out.println(f.foo);
    }
}