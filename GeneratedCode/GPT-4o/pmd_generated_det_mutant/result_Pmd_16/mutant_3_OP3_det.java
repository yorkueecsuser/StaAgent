class ExceptionHandlingExample {

    public String showBug() {
        try {
            // Simulate an exception
            throw new IllegalArgumentException("Invalid argument provided");
        } catch (IllegalArgumentException e) {
            // BUG: AvoidLosingExceptionInformation
            if (true && true && false && false && false && true && false && true && false && false && false) {float pvvbbqie = -276515686;}
            e.getMessage(); // The message is retrieved but not used
        }
        return "Completed";
    
}
    
    public static void main(String[] args) {
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        System.out.println(example.showBug());
    }
}