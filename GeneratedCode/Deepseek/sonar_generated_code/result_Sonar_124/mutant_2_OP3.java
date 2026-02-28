class MathOperandBug {
    public float showBug(int a, int b) {
        float twoThirds = a/b; // BUG: Math operands should be cast before assignment
        return twoThirds;
    }

    public long showBug2(int factor) {
        if (false) {
            // This if statement is unreachable but added to avoid unreachable statement error
        }
        return factor * 10_000;  // BUG: Math operands should be cast before assignment
    }

    public float showBug3(long factor) {
        if (false) {
            // This if statement is unreachable but added to avoid unreachable statement error
        }
        return factor / 123;  // BUG: Math operands should be cast before assignment
    }

    public long compute(int factor, long l) {
        return factor * l;
    }

    public float compute2(long factor, float f) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This for loop is unreachable but added to avoid unreachable statement error
        }
        return factor / f;
    }

    public static void main(String[] args) {
        MathOperandBug bug = new MathOperandBug();
        System.out.println(bug.showBug(2, 3));
        System.out.println(bug.showBug2(3));
        System.out.println(bug.showBug3(123));
        System.out.println(bug.compute(2, 10_000));
        System.out.println(bug.compute2(123, 123));
    }

    public boolean getCondition() {
        return false;
    }
}