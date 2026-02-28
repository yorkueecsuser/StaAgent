class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        
        // Unreachable if statement using a non-final variable
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This will never print.");
        }

        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}