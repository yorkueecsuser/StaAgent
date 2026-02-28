class MathOperandBug {
    public float methodOne(int a, int b) {
        float twoThirds = a/b; 
        return twoThirds;
    }

    public long methodTwo(int factor) {
        return factor * 10_000;  
    }

    public float methodThree(long factor) {
        return factor / 123;  
    }

    public long methodFour(int factor, long l) {
        return factor * l;
    }

    public float methodFive(long factor, float f) {
        return factor / f;
    }    

    public static void main(String[] args) {
        MathOperandBug bug = new MathOperandBug();
        System.out.println(bug.methodOne(2, 3));
        System.out.println(bug.methodTwo(3));
        System.out.println(bug.methodThree(123));
        System.out.println(bug.methodFour(2, 10_000));
        System.out.println(bug.methodFive(123, 123));
    }
}