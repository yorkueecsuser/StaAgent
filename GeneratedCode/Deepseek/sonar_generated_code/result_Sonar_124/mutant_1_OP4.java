class MathOperandBug {
    public float showBug(int a, int b) {
        float twoThirds = a/b; // BUG: Math operands should be cast before assignment
        if (false) {
            System.out.println("This is an unreachable if-else statement");
        }
        return twoThirds;
    }

    public long showBug2(int factor) {
        long factorTimesTenThousand = factor * 10_000;  // BUG: Math operands should be cast before assignment
        while (false) {
            System.out.println("This is an unreachable while loop");
        }
        return factorTimesTenThousand;
    }

    public float showBug3(long factor) {
        float factorDividedBy123 = factor / 123;  // BUG: Math operands should be cast before assignment
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable for loop");
        }
        return factorDividedBy123;
    }

    public long compute(int factor, long l) {
        long factorTimesL = factor * l;
        if (false) {
            System.out.println("This is another unreachable if-else statement");
        }
        return factorTimesL;
    }

    public float compute2(long factor, float f) {
        float factorDividedByF = factor / f;
        while (false) {
            System.out.println("This is another unreachable while loop");
        }
        return factorDividedByF;
    }    

    public static void main(String[] args) {
        MathOperandBug bug = new MathOperandBug();
        System.out.println(bug.showBug(2, 3));
        System.out.println(bug.showBug2(3));
        System.out.println(bug.showBug3(123));
        System.out.println(bug.compute(2, 10_000));
        System.out.println(bug.compute2(123, 123));
    }
}