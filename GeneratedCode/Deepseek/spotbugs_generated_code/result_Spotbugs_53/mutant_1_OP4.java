class ExceptionNotThrown {
    private boolean getCondition() {
        return false;
    }

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
            if (getCondition()) {
                System.out.println("This line is unreachable due to the mutation operator");
            }
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}