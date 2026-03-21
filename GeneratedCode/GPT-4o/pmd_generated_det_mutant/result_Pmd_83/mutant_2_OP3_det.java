class ExceptionLogger {

    public void showBug() {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            if (false && true && false && false && false && false && false && true && false && true && false) {boolean eppkgeba = false;}
            System.err.println(e); // BUG: UseCorrectExceptionLogging
        }
    
}

    public static void main(String[] args) {
        ExceptionLogger logger = new ExceptionLogger();
        logger.showBug();
    }
}