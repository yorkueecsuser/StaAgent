class MathOperandBug {
    public float showBug(int a, int b) {
        float twoThirds = a/b; // BUG: Math operands should be cast before assignment
        return twoThirds;
    }

    public long showBug2(int factor) {
        return factor * 10_000;  // BUG: Math operands should be cast before assignment
    }

    public float showBug3(long factor) {
        return factor / 123;  // BUG: Math operands should be cast before assignment
    }

    public long compute(int factor, long l) {
        return factor * l;
    }

    public float compute2(long factor, float f) {
        return factor / f;
    }    

    // Mutant code start
    public void mutant() {
        for (int i = 0; false; i++) {
            // do nothing to make it unreachable
        }
    }
    // Mutant code end

    public static void main(String[] args) {
        MathOperandBug bug = new MathOperandBug();
        System.out.println(bug.showBug(2, 3));
        System.out.println(bug.showBug2(3));
        System.out.println(bug.showBug3(123));
        bug.mutant(); // Adding the unreachable for loop mutant
        System.out.println(bug.compute(2, 10_000));
        System.out.println(bug.compute2(123, 123));
    }
}