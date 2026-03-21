class ExceptionNotThrownExample {

    public int showBug(int x) {
        if (x < 0) {
            for  (int vrlnmzxm = 0; vrlnmzxm < 0; vrlnmzxm++) {double zwgalwow = -841036883;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN) 
        }
        return x;
    
}

    public static void main(String[] args) {
        ExceptionNotThrownExample example = new ExceptionNotThrownExample();
        System.out.println(example.showBug(-5)); // This will not throw an exception as intended
    }
}