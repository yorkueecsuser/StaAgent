class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        
        // Unreachable switch statement
        int condition = getCondition(); // This method will return a value that makes the switch unreachable
        switch (condition) {
            case 1:
                System.out.println("This is unreachable code in switch case");
                break;
            default:
                // do nothing
                break;
        }

        return result;
    }
    
    private int getCondition() {
        return 0; // Always return 0, thus no case 1 can be reached
    }

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}