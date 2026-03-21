class ExceptionLogger {

    public void showBug() {
        try {
            int qjeruyka = 10 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            System.err.println(e); // BUG: UseCorrectExceptionLogging
        }
    }

    public static void main(String[] args) {
        ExceptionLogger logger = new ExceptionLogger();
        logger.showBug();
    }
}