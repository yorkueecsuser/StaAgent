class StringIndexOutOfBoundsExample {
    public String showBug(String input) {
        // Attempting to access a character at an index that is out of bounds
        // This will throw a StringIndexOutOfBoundsException at runtime if input is empty
        char result = input.charAt(5); // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        
        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method returns a value that ensures the switch is unreachable
        switch(unreachableValue) {
            case 1:
                System.out.println("This is unreachable case 1");
                break;
            case 2:
                System.out.println("This is unreachable case 2");
                break;
            default:
                System.out.println("This is unreachable default case");
                break;
        }
        
        return String.valueOf(result);
    }
    
    private int getUnreachableValue() {
        return 3; // Ensures that the switch statement cases are unreachable
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        try {
            // This call will demonstrate the bug if the input string is shorter than 6 characters
            System.out.println(example.showBug("abcd"));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}