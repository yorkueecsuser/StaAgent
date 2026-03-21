class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            for  (int ujdypaab = 0; ujdypaab < 0; ujdypaab++) {boolean kauyrirg = true;}
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