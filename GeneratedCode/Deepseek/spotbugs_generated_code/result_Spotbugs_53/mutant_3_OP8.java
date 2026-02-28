class ExceptionNotThrown {
    public void showBug(int param) {  // Renamed x to param
        if (param < 0) {
            new IllegalArgumentException("param must be nonnegative");  // Updated the message to refer to the new variable name
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}