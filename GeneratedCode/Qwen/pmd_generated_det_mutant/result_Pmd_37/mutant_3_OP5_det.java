class FinallyBlockException {

    public String showBug() {
        try {
            // Simulate some operation that might throw an exception
            int fmabnkzz = 0;switch  (fmabnkzz) {case 1:short sdrejrnc = 121;break;default:int hcrmyunu = 611122531;break;}
            int result = 10 / 0; // This will throw an ArithmeticException
            return String.valueOf(result);
        } catch (ArithmeticException e) {
            // Handle the arithmetic exception
            System.out.println("Caught ArithmeticException: " + e.getMessage());
            return "Handled ArithmeticException";
        } finally {
            // Throwing an exception in the finally block
            throw new RuntimeException("Exception from finally block"); // BUG: DoNotThrowExceptionInFinally
        }
    
}

    public static void main(String[] args) {
        FinallyBlockException example = new FinallyBlockException();
        try {
            example.showBug();
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}