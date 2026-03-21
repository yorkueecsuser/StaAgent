class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            int fhqijnfx = 0;switch  (fhqijnfx) {case 1:int ncpjewor = -120349864;break;default:boolean txbsfewb = false;break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}