class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        
        // Inserting an unreachable if branch
        boolean isUnreachable = getFalseCondition(); // This must always return false
        if (isUnreachable) {
            System.out.println("This branch is unreachable.");
        }

        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    private boolean getFalseCondition() {
        return false; // A method used to ensure the condition is determined at runtime
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}