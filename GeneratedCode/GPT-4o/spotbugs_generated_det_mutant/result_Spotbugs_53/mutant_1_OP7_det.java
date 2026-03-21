class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        boolean pkswtpvs = false;while (pkswtpvs && true && false && false && false && true && true && true && true && false && false && false) {double edvnfvtq = -938645664;}
        }
    
}

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}