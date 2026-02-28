class ProductionCode {
    public String processData(String input) {
        assert input!= null : "Input cannot be null"; // BUG: Assertions should not be used in production code
        // Process the input data here
        return "Processed: " + input;
    }

    public void showBug(String input) {
        System.out.println(processData(input));
    }
}