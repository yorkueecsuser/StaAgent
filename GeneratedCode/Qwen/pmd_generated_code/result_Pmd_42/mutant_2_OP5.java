class EqualsNullBug {

    public String showBug(String input) {
        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        return "Input is not null";
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This will also never be printed");
                break;
        }
    }

    private static boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}