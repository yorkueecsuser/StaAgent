class NullInstanceofExample {

    // Method to demonstrate the bug
    public boolean showBug() {
        Object obj = null;
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF) 

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This is unreachable");
                break;
            default:
                System.out.println("This is also unreachable");
                break;
        }
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullInstanceofExample example = new NullInstanceofExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}