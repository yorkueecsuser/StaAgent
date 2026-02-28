class AddEmptyStringBug {

    public String showBug(int number) {
        String result = "" + number; // BUG: AddEmptyString

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            result += "Unreachable"; // This line will never be executed
        }

        return result;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}