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

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // This will always evaluate to 1, making the switch unreachable
            case 0:
                System.out.println("This is unreachable");
                break;
            default:
                // Default case to avoid compiler warning
                break;
        }
    }

    private static boolean getCondition() {
        return false; // This method always returns false, ensuring the switch condition is always 1
    }
}