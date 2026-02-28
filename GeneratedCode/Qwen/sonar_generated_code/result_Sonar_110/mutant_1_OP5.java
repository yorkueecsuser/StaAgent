class NullPointerExample {

    // Method to demonstrate the null pointer dereference bug
    public String showBug(String input) {
        boolean condition = getCondition(); // Dynamically determined condition
        switch (condition? 0 : 1) { // Unreachable switch statement
            case 0:
                System.out.println("This is an unreachable case.");
                break;
            default:
                System.out.println("This is also unreachable.");
                break;
        }
        return input.length() + " characters"; // BUG: Null pointers should not be dereferenced
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the switch is unreachable
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}