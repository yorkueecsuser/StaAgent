class EqualsNullExample {

    public boolean showBug(String input) {
        boolean unreachableCondition = getFalseCondition(); // Ensure the condition is evaluated at runtime
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This is unreachable");
        }
        
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}