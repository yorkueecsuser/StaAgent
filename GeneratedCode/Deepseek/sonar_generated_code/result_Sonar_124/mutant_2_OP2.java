class MathOperandBug {
    public float showBug(int a, int b) {
        float twoThirds = a/b; // BUG: Math operands should be cast before assignment
        float twoThirds1 = a/b;
        return twoThirds;
    }

    public long showBug2(int factor) {
        long factor1 = factor * 10_000;  // Mutation adding
        return factor1;  // Mutation: Return mutated variable
    }

    public float showBug3(long factor) {
        float factor1 = factor / 123;  // Mutation adding
        return factor1;  // Mutation: Return mutated variable
    }

    public long compute(int factor, long l) {
        long result = factor * l;
        return result;
    }

    public float compute2(long factor, float f) {
        float result = factor / f;
        return result;
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