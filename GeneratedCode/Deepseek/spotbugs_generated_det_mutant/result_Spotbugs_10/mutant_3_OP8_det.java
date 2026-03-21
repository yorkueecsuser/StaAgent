class BugExample {

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug()); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    }

    public float showBug() {
        float ogethfcw = 16777216.0f;
        float edmneaxr = 1.0f;
        float dkgvzotc = ogethfcw + edmneaxr;
        return dkgvzotc; // The dkgvzotc of this operation is supposed to be imprecise but Java rounds it to a 32-bit float
    }
}