class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            int ugqusczt = 0;switch  (ugqusczt) {case 1:float fbpaxcqu = 978659221;break;default:long umvmsasu = -102184821;break;}
            throw new Exception("Throwing exception in finally block");
        }
    
}

    public static void main(String[] args) {
        BuggyClass bc = new BuggyClass();
        try {
            bc.showBug();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}