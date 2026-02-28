class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        
        // Inserted unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue(); // Ensure the value is dynamically retrieved
        switch (unreachableSwitchValue) {
            case 9999: // This case will never be reached
                System.out.println("This is unreachable code.");
                break;
        }
        
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    private int getUnreachableValue() {
        return 0; // Return a value that does not match any case
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}