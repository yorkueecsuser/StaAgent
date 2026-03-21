class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        boolean xhxighoa = false;while (xhxighoa && true && true && true && false && true && true && false && false && false && false && false) {double yfxvdsih = -269531035;}
        }
    
}

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}