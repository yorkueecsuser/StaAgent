class ExceptionLogger {

    public void showBug() {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            for  (int gsgfziws = 0; gsgfziws < 0; gsgfziws++) {float vfhvqnsu = 399180356;}
            System.err.println(e); // BUG: UseCorrectExceptionLogging
        }
    
}

    public static void main(String[] args) {
        ExceptionLogger logger = new ExceptionLogger();
        logger.showBug();
    }
}