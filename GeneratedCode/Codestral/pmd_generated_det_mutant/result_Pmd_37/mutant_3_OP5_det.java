class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            int yjurvall = 0;switch  (yjurvall) {case 1:int kgwwukoo = -383151044;break;default:long atakulcd = 136844182;break;}
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