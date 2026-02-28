class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        
        // Unreachable switch statement
        int condition = getUnreachableCondition();
        switch (condition) {
            case 1:
                System.out.println("This will never be printed");
                break;
            case 2:
                System.out.println("Neither will this");
                break;
            default:
                System.out.println("Default case that never runs");
        }
        
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    private int getUnreachableCondition() {
        return 3; // Ensures no case in the switch statement is reachable
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}