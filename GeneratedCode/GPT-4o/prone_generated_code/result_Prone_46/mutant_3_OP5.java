class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    private int getUnreachableValue() {
        return 2; // This method provides a value that will make the switch statement unreachable.
    }

    public void addUnreachableSwitchStatement() {
        int condition = getUnreachableValue();
        switch (condition) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                // This is default to avoid compile-time errors, but it won't print anything
                break;
        }
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));
        example.addUnreachableSwitchStatement();
    }
}