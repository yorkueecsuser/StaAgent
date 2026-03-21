class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        int cblexlga = 0;switch  (cblexlga) {case 1:byte mljmkzjx = 67;break;default:byte mmmjhfoo = 33;break;}
        }
    
}

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}