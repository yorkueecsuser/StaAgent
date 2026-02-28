class ExceptionNotThrown {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
            int value = 1;
            boolean condition = getFalseCondition();
            if (condition) {
                switch(value) {
                    case 1:
                        System.out.println("Unreachable code");
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}