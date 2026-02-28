class AddEmptyStringBug {

    public String showBug(int number) {
        String result = "" + number; // BUG: AddEmptyString

        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            result += "reachable";
        } else {
            result += "unreachable"; // This branch is unreachable because getCondition() always returns false
        }

        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the else branch unreachable
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}