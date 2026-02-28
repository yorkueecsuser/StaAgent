class AddEmptyStringBug {

    public String showBug(int number) {
        String result = "" + number; // BUG: AddEmptyString

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable
            result += " reachable";
        } else {
            // This block is unreachable because getCondition() always returns true
            result += " unreachable";
        }

        return result;
    }

    private boolean getCondition() {
        // Always return true to make the else block unreachable
        return true;
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}