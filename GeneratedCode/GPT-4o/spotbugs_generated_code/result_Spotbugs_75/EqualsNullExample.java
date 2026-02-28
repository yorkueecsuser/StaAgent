class EqualsNullExample {

    public boolean showBug(String input) {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable while loop
            System.out.println("This will never print.");
        }
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    private boolean getUnreachableCondition() {
        return false; // This method returns false making the loop condition false at runtime
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}