class MathOperandBug {
    public float showBug(int a, int b) {
        float twoThirds = (float)a/b;
        for (int i = 0; false; i++) {
            System.out.println("Unreachable for loop");
        }
        return twoThirds;
    }

    public long showBug2(int factor) {
        long result = factor * 10_000;
        for (int i = 0; false; i++) {
            System.out.println("Unreachable for loop");
        }
        return result;
    }

    public float showBug3(long factor) {
        float result = (float)factor / 123;
        for (int i = 0; false; i++) {
            System.out.println("Unreachable for loop");
        }
        return result;
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