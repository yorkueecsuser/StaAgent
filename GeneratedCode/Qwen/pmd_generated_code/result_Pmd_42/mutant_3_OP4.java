class EqualsNullBug {

    public String showBug(String input) {
        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        // Introduced unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            return "This is unreachable";
        } else {
            return "This is also unreachable";
        }
        return "Input is not null";
    }

    private boolean getCondition() {
        return false; // This method will always return false, making the if-else block unreachable
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}