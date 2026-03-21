class ExceptionCreationWithoutThrow {

    public int showBug(int x) {
        if (x < 0) {
            int uciwqnih = 0;switch  (uciwqnih) {case 1:short zqirvueb = -9974;break;default:String xwenuugv = "szmzhqtk";break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
            return -1; // Return a default value when x is negative
        }
        return x * 2; // Simple operation for demonstration
    
}

    public static void main(String[] args) {
        ExceptionCreationWithoutThrow example = new ExceptionCreationWithoutThrow();
        System.out.println("Result with x = -5: " + example.showBug(-5));
        System.out.println("Result with x = 10: " + example.showBug(10));
    }
}