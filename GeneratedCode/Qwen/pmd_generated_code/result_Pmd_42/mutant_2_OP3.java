class EqualsNullBug {

    public String showBug(String input) {
        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        
        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            return "This is unreachable";
        }
        
        return "Input is not null";
    }

    private boolean getUnreachableCondition() {
        return false; // This method will always return false, making the if statement unreachable
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}