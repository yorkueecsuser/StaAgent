class ExceptionLogger {

    public void showBug() {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            if (false && true && false && true && true && false && true && true && true && true && false) {double ydthcotn = -899671472;}else{int qxdyqopj = -859529187;}
            System.err.println(e); // BUG: UseCorrectExceptionLogging
        }
    
}

    public static void main(String[] args) {
        ExceptionLogger logger = new ExceptionLogger();
        logger.showBug();
    }
}