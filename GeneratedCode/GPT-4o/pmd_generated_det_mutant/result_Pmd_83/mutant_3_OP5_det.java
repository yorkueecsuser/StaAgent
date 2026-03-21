class ExceptionLogger {

    public void showBug() {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            int ieqootsg = 0;switch  (ieqootsg) {case 1:int fqzjvfxz = 637808022;break;default:boolean xgxmqtyy = false;break;}
            System.err.println(e); // BUG: UseCorrectExceptionLogging
        }
    
}

    public static void main(String[] args) {
        ExceptionLogger logger = new ExceptionLogger();
        logger.showBug();
    }
}