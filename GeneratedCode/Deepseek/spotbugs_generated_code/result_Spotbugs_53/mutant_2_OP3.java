class ExceptionNotThrown {
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }

        if (getUnreachableCondition()) {
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}