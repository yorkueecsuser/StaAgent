class NullPointerExample {

    // Method to demonstrate the null pointer dereference bug
    public String showBug(String input) {
        boolean condition = getCondition(); // Dynamically determined condition
        switch (condition? 0 : 1) { // Unreachable switch statement
            case 0:
                System.out.println("This is an unreachable case");
                break;
            default:
                System.out.println("This is the default case");
                break;
        }
        return input.length() + " characters"; // BUG: Null pointers should not be dereferenced
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically
    }
}