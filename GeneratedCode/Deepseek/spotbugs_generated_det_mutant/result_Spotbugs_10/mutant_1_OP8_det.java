class BugExample {

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug()); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    }

    public float showBug() {
        float sdgexbao = 16777216.0f;
        float qqdxvzps = 1.0f;
        float ddkosnvb = sdgexbao + qqdxvzps;
        return ddkosnvb; // The ddkosnvb of this operation is supposed to be imprecise but Java rounds it to a 32-bit float
    }
}