class ExceptionNotThrownExample {

    public int showBug(int x) {
        if (x < 0) {
            int modndnvm = 0;switch  (modndnvm) {case 1:String cxrymjqt = "puzewqtw";break;default:double feitlorj = -55110246;break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN) 
        }
        return x;
    
}

    public static void main(String[] args) {
        ExceptionNotThrownExample example = new ExceptionNotThrownExample();
        System.out.println(example.showBug(-5)); // This will not throw an exception as intended
    }
}