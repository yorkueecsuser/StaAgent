import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName

    boolean getCondition() {
        return false;
    }

    int getValue() {
        return 0;
    }
}

interface Operation {
    int OPERATION_NUMBER = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        System.out.println(f.foo);

        boolean condition = f.getCondition();
        if (condition) {
            // Add mutation code here
        } else {
            // This is to avoid unreachable statement error
        }

        boolean conditionWhile = f.getCondition();
        while (conditionWhile) {
            // Add mutation code here
        }

        boolean conditionFor = f.getCondition();
        for (int i = 0; conditionFor; i++) {
            // Add mutation code here
        }

        boolean shouldRun = f.getCondition();
        if (shouldRun) {
            // Add mutation code here
        } else {
            // Add mutation code here
        }

        int value = f.getValue();
        switch(value) {
            case 1:
                // Add mutation code here
                break;
            default:
                // This is to avoid unreachable statement error
                break;
        }
    }
}