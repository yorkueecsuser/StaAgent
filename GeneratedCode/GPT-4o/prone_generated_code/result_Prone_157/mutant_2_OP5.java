class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero

        // Insert an unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue(); // This method returns a value that ensures the switch is unreachable
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            case 2:
                System.out.println("This case is also unreachable");
                break;
            default:
                System.out.println("This default case is unreachable too");
                break;
        }

        return result;
    }
    
    private int getUnreachableValue() {
        // Always returns a value that doesn't match any case
        return 0;
    }

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}