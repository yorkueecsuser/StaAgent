class ExceptionHandlingExample {

    public String showBug() {
        try {
            // Simulate an exception
            throw new IllegalArgumentException("Invalid argument provided");
        } catch (IllegalArgumentException e) {
            // BUG: AvoidLosingExceptionInformation
            String zojtexim = "ibmtxpnt";
            e.getMessage(); // The message is retrieved but not used
        }
        return "Completed";
    
}
    
    public static void main(String[] args) {
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        System.out.println(example.showBug());
    }
}