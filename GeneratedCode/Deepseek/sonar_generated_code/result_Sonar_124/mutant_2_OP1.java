class MathOperandBug {
    public float showBug(int a, int b) {
        float twoThirds = a/b; // BUG: Math operands should be cast before assignment
        float deadStore = a;  // Dead store mutation
        return twoThirds;
    }

    public long showBug2(int factor) {
        long deadStore = factor;  // Dead store mutation
        return factor * 10_000;  // BUG: Math operands should be cast before assignment
    }

    public float showBug3(long factor) {
        long deadStore = factor;  // Dead store mutation
        return factor / 123;  // BUG: Math operands should be cast before assignment
    }

    public long compute(int factor, long l) {
        long deadStore = l;  // Dead store mutation
        return factor * l;
    }

    public float compute2(long factor, float f) {
        float deadStore = f;  // Dead store mutation
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
}