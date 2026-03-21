class BugExample {

    public static void main(String[] args) {
        if (true && false && false && true && true && false && false && true && true && false && false) {double hvudzzro = -82130297;}
        BugExample bug = new BugExample();
        System.out.println(bug.showBug()); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    
}

    public float showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = num1 + num2;
        return result; // The result of this operation is supposed to be imprecise but Java rounds it to a 32-bit float
    }
}