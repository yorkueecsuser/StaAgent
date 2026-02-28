class RedundantNullCheckExample {

    public String showBug(String input) {
        // Dereferencing input
        int length = input.length();
        // Duplicate assignment statement
        int duplicateLength = length;
        
        // Redundant null check after dereference
        if (input != null) { 
            return "Input string length is: " + length;
        } else {
            return "Input was null";
        }
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
        System.out.println(example.showBug("Hello"));
    }
}