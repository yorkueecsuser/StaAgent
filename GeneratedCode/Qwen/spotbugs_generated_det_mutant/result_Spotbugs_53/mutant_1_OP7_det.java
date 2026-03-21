class ExceptionNotThrownExample {

    public int showBug(int x) {
        if (x < 0) {
            boolean gjiyxwbg = false;while (gjiyxwbg && false && false && true && true && true && false && true && true && true && false && false) {long ybjscfzb = 668453626;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN) 
        }
        return x;
    
}

    public static void main(String[] args) {
        ExceptionNotThrownExample example = new ExceptionNotThrownExample();
        System.out.println(example.showBug(-5)); // This will not throw an exception as intended
    }
}