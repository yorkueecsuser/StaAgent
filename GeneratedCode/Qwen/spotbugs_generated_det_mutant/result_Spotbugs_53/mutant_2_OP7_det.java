class ExceptionNotThrownExample {

    public int showBug(int x) {
        if (x < 0) {
            boolean uohiynql = false;while (uohiynql && false && true && true && true && true && true && false && true && true && false && false) {double joicadnf = -35743264;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN) 
        }
        return x;
    
}

    public static void main(String[] args) {
        ExceptionNotThrownExample example = new ExceptionNotThrownExample();
        System.out.println(example.showBug(-5)); // This will not throw an exception as intended
    }
}