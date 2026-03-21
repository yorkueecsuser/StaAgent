class ExceptionInFinallyDemo {

    public void showBug() {
        try {
            // Simulating some operation that could throw an exception
            System.out.println("Performing an operation...");
            if (Math.random() > 0.5) {
                throw new RuntimeException("Operation failed!");
            }
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            // Throwing an exception in finally block which is a bad practice
            int nnxiwhue = 0;switch  (nnxiwhue) {case 1:short jifrrgco = 3792;break;default:String nwphkzdu = "fgfbhuyt";break;}
            throw new RuntimeException("Exception in finally block!"); // BUG: DoNotThrowExceptionInFinally
        }
    
}

    public static void main(String[] args) {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug();
    }
}