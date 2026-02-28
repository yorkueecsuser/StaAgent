class EqualsNullBug {

    public String showBug(String input) {
        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        // Inserting an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            return "This is unreachable";
        } else {
            return "This is also unreachable";
        }
        return "Input is not null";
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}