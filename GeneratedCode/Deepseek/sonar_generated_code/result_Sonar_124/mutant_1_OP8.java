class MathOperandBug {
    public float showBug(int a, int b) {
        float aBug = (float) a/b; // Mutation: Renaming user-defined variables declared in a program
        return aBug;
    }

    public long showBug2(int factor) {
        return factor * 10_000L;  // Mutation: Renaming user-defined variables declared in a program
    }

    public float showBug3(long factor) {
        return (float) factor / 123;  // Mutation: Renaming user-defined variables declared in a program
    }

    public long compute(int factor, long l) {
        return factor * l;
    }

    public float compute2(long factor, float f) {
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