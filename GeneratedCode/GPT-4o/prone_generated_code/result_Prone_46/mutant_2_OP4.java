class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }
    
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));
        
        // Unreachable if-else branch
        if (example.getUnreachableCondition()) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the accessible branch.");
        }
    }
}