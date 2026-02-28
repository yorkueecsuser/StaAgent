class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        
        // Unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }
        
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    private int getUnreachableCondition() {
        return 0; // This ensures the switch statement remains unreachable
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}