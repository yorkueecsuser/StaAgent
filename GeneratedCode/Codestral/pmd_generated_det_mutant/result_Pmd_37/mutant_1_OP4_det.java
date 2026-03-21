class BuggyClass {
    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            if (false && true && false && true && false && true && false && true && true && true && false) {byte xbahdeme = 67;}else{int tgvxleud = -792017921;}
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