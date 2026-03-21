class ExceptionLogger {

    public void showBug() {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            int scxnvkdh = 0;switch  (scxnvkdh) {case 1:char qrtsqiyh = 'a';break;default:double ulgznlnk = 627074814;break;}
            System.err.println(e); // BUG: UseCorrectExceptionLogging
        }
    
}

    public static void main(String[] args) {
        ExceptionLogger logger = new ExceptionLogger();
        logger.showBug();
    }
}