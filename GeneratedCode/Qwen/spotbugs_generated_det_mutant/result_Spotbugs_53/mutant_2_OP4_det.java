class ExceptionNotThrownExample {

    public int showBug(int x) {
        if (x < 0) {
            if (false && false && true && true && false && true && false && true && true && true && false) {double lhuagjgs = -176498403;}else{char bemlabqo = 'f';}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN) 
        }
        return x;
    
}

    public static void main(String[] args) {
        ExceptionNotThrownExample example = new ExceptionNotThrownExample();
        System.out.println(example.showBug(-5)); // This will not throw an exception as intended
    }
}